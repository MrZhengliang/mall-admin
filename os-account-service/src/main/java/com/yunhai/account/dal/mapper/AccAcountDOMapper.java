package com.yunhai.account.dal.mapper;


import com.yunhai.account.common.model.account.AccAccountCriteria;
import com.yunhai.account.common.model.account.AccAcountDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
 * The Table OS_ACC_ACOUNT.
 * OS_ACC_ACOUNT
 */
public interface AccAcountDOMapper {

    /**
     * desc:插入表:OS_ACC_ACOUNT.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO OS_ACC_ACOUNT( PHONE ,EMAIL ,PASSWORD ,NICK_NAME ,CREATE_TIME ,UPDATE_TIME ,REMARK ,VERSION ,STATE )VALUES( #{phone,jdbcType=VARCHAR} ,#{email,jdbcType=VARCHAR} ,#{password,jdbcType=VARCHAR} ,#{nickName,jdbcType=VARCHAR} ,#{createTime,jdbcType=TIMESTAMP} ,#{updateTime,jdbcType=TIMESTAMP} ,#{remark,jdbcType=VARCHAR} ,#{version,jdbcType=INTEGER} ,#{state,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(AccAcountDO entity);
    /**
     * desc:更新表:OS_ACC_ACOUNT.<br/>
     * descSql =  UPDATE OS_ACC_ACOUNT SET PHONE = #{phone,jdbcType=VARCHAR} ,EMAIL = #{email,jdbcType=VARCHAR} ,PASSWORD = #{password,jdbcType=VARCHAR} ,NICK_NAME = #{nickName,jdbcType=VARCHAR} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP} ,REMARK = #{remark,jdbcType=VARCHAR} ,VERSION = #{version,jdbcType=INTEGER} ,STATE = #{state,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(AccAcountDO entity);
    /**
     * desc:根据主键删除数据:OS_ACC_ACOUNT.<br/>
     * descSql =  DELETE FROM OS_ACC_ACOUNT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:OS_ACC_ACOUNT.<br/>
     * descSql =  SELECT * FROM OS_ACC_ACOUNT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return AccAcountDO
     */
    AccAcountDO getByPrimary(Long id);


    List<AccAcountDO> selectByExample(@Param("phone") String phone,@Param("password") String password);
}
