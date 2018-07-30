package com.yunhai.gateway.client.hystrix;

import com.yunhai.base.conf.model.account.AccAcountDO;
import com.yunhai.gateway.client.AccountFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author fuzl
 * @version v 0.1 2018/7/30 15:29 fuzl
 * @description
 */
@Component
public class AccountFeignClientHystrix implements AccountFeignClient {
    /**
     * 登录
     *
     * @param phone
     * @param password
     * @return
     */
    @Override
    public AccAcountDO login(String phone, String password) {
        return new AccAcountDO();
    }

    /**
     * 注册
     *
     * @param phone
     * @param password
     * @return
     */
    @Override
    public String signup(String phone, String password) {
        return "signup fail!";
    }
}
