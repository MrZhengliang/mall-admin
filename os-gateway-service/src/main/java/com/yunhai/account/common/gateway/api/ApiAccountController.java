package com.yunhai.account.common.gateway.api;

import com.alibaba.fastjson.JSONObject;
import com.yunhai.account.common.model.Result;
import com.yunhai.account.common.utils.uuid.UUIdUtil;
import com.yunhai.account.common.gateway.client.AccountFeignClient;
import com.yunhai.account.common.model.account.AccAcountDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuzl
 * @version v 0.1 2018/7/27 14:01 fuzl
 * @description
 */
@Api(value = "用户服务", tags = "用户服务接口")
@RestController
public class ApiAccountController {

    private Logger logger = LoggerFactory.getLogger(ApiAccountController.class);


    @Autowired
    private AccountFeignClient accountFeignClient;

    @ApiOperation(value = "用户登陆")
    @RequestMapping(value = "acc/login", method = { RequestMethod.POST })
    public Result login(@ApiParam(value = "手机号") @RequestParam(required = true) String phone,
                        @ApiParam(value = "密码") @RequestParam(required = true) String password) {
        Result restAPIResult = new Result<>();
        AccAcountDO account = accountFeignClient.login(phone, password);
        if (StringUtils.isEmpty(account.getId())) {
            restAPIResult = Result.wrapErrorResult(9,"账号查询不到!");
        } else {
            try {
                // 正常情况返回jwt
                JSONObject subject = new JSONObject(true);
                subject.put("id", account.getId());
                // token此处定义12小时有效，据实际应用场景确定有效性，也可以定义刷新机制，保持用户token的使用时限
                String accessToken = UUIdUtil.next();//JWTUtils.createJWT(UUIdUtil.next(), subject.toJSONString(),12 * 60 * 60 * 1000);
                restAPIResult.setData(accessToken);
            } catch (Exception e) {
                logger.error("生成jwt异常{}", e);
            }
        }
        logger.info("login result = {}", restAPIResult.getData());
        return restAPIResult;
    }

}
