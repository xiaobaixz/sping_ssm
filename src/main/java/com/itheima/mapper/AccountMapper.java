package com.itheima.mapper;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountMapper {

    // 保存数据的方法
    public void save(Account account);

    // 查询所有数据的方法
    public List<Account> findAll();

}
