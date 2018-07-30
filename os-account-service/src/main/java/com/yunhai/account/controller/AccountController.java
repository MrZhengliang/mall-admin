package com.yunhai.account.controller;

import com.yunhai.account.common.model.account.AccAcountDO;
import com.yunhai.account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 个人账户
 * 
 * @author fuzl
 *
 */
@RestController
@RequestMapping("/acc")
public class AccountController {

	@Autowired
	IAccountService accountService;

	/**
	 * 登陆
	 * 
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "login", method = {RequestMethod.GET,RequestMethod.POST})
	public AccAcountDO login(@RequestParam("phone") String phone, @RequestParam("password") String password) {
		AccAcountDO result = accountService.login(phone, password);
		return result;
	}

//	/**
//	 * 注册
//	 *
//	 * @param phone
//	 * @param password
//	 * @return
//	 */
//	@RequestMapping(value = "signup", method = RequestMethod.GET)
//	public String signup(String phone, String password) {
//		boolean result = accountService.signup(phone, password);
//		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
//	}
}
