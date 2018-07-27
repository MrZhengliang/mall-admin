package com.yunhai.account.service;

import com.yunhai.account.common.model.account.AccAcountDO;

public interface IAccountService {

	/**
	 * @param phone
	 * @param password
	 * @return
	 */
	AccAcountDO login(String phone, String password);
	
	/**
	 * @param phone
	 * @param password
	 * @return
	 */
//	boolean signup(String phone, String password);
	
//	/**
//	 * @param tid
//	 * @return
//	 */
//	AccAddress getAccAddress(String tid);
//
//	/**
//	 * @param accountId
//	 * @return
//	 */
//	List<AccAddress> getAddressList(String accountId);
}
