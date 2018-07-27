package com.yunhai.account.service;

import com.yunhai.account.common.model.account.AccAcountDO;
import com.yunhai.account.dal.mapper.AccAcountDOMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {

    private Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    AccAcountDOMapper accAcountDOMapper;

//	@Autowired
//	AccAddressMapper addressMapper;
//
//	@Override
//	public AccAddress getAccAddress(String tid) {
//		return null;
//	}

    @Override
    public AccAcountDO login(String phone, String password) {
//        AccAccountCriteria criteria = new AccAccountCriteria();
//        criteria.createCriteria().andPhoneEqualTo(phone).andPasswordEqualTo(password);
        List<AccAcountDO> list = accAcountDOMapper.selectByExample(phone,password);
        logger.info("{}登陆成功!", phone);
        return CollectionUtils.isEmpty(list) ? new AccAcountDO() : list.get(0);
    }

//	@Override
//	public boolean signup(String phone, String password) {
//		Account account = new Account();
//		account.setPhone(phone);
//		account.setPassword(password);
//		AccAccountCriteria example = new AccAccountCriteria();
//		example.createCriteria().andPhoneEqualTo(phone);
//		List<Account> list = accountMapper.selectByExample(example);
//		if (CollectionUtils.isNotEmpty(list)) {
//			logger.warn("{}-用户已存在，请选择其它用户名!",phone);
//			return false;
//		}
//		int result = accountMapper.insertSelective(account);
//		logger.info("{}注册成功！",phone);
//		return result > 0 ? true : false;
//	}

//	@Override
//	public List<AccAddress> getAddressList(String accountId) {
//		AccAddressCriteria criteria = new AccAddressCriteria();
//		criteria.createCriteria().andAccountIdEqualTo(accountId);
//		List<AccAddress> list = addressMapper.selectByExample(criteria);
//		return list;
//	}

}
