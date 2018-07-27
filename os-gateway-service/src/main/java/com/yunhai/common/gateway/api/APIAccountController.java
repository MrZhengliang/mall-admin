package com.yunhai.common.gateway.api;

import com.alibaba.fastjson.JSONObject;
import com.yunhai.common.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author fuzl
 * @version v 0.1 2018/7/27 14:01 fuzl
 * @description
 */
@Api(value = "用户服务", tags = "用户服务接口")
@RestController
public class APIAccountController {

    private Logger logger = LoggerFactory.getLogger(APIAccountController.class);


    @ApiOperation(value = "用户登陆")
    @RequestMapping(value = "acc/login", method = { RequestMethod.POST })
    public Result<String> login(@ApiParam(value = "手机号") @RequestParam(required = true) String phone,
                                @ApiParam(value = "密码") @RequestParam(required = true) String password, HttpSession session) {
        Result<String> restAPIResult = new Result<>();
//        Account account = accountFeignClient.login(phone, password);
//        if (StringUtils.isEmpty(account.getTid())) {
//            restAPIResult = new Result<>("登陆失败，用户名或密码不正确!");
//        } else {
//            try {
//                // 正常情况返回jwt
//                JSONObject subject = new JSONObject(true);
//                subject.put("tid", account.getTid());
//                // token此处定义12小时有效，据实际应用场景确定有效性，也可以定义刷新机制，保持用户token的使用时限
//                String accessToken = JWTUtils.createJWT(UUIDUtils.getUUID(), subject.toJSONString(),
//                        12 * 60 * 60 * 1000);
//                restAPIResult.setRespData(accessToken);
//            } catch (Exception e) {
//                logger.error("生成jwt异常{}", e);
//            }
//        }
//        logger.info("login result = {}", restAPIResult.getRespData());
        return restAPIResult;
    }

}
