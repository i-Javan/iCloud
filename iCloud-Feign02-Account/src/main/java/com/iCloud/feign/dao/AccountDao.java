package com.iCloud.feign.dao;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author IT云清
 */
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
