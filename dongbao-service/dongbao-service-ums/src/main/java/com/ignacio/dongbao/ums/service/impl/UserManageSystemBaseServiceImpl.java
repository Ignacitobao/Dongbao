package com.ignacio.dongbao.ums.service.impl;

import com.ignacio.dongbao.dao.UserManageSystemDao;
import com.ignacio.dongbao.ums.IUserManageSystemBaseService;
import com.ignacio.dongbaocommonbase.exception.DongbaoException;

import com.ignacio.dongbao.ums.entity.UmsMember;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/5/20 at 13:57
 */

@Service
@Slf4j
public class UserManageSystemBaseServiceImpl implements IUserManageSystemBaseService {

    @Autowired
    UserManageSystemDao userManageSystemDao;


    /**
     * <h2>单个新增用户</h2>
     *
     * @param umsMember
     * @throws DongbaoException
     */
    @Override
    public void add(UmsMember umsMember) throws DongbaoException {
        userManageSystemDao.save(umsMember);
    }

    /**
     * <h2>更新已有用户信息</h2>
     * @param umsMember
     * @throws DongbaoException
     */
    @Override
    public void update(UmsMember umsMember) throws DongbaoException {
        userManageSystemDao.save(umsMember);
    }


}
