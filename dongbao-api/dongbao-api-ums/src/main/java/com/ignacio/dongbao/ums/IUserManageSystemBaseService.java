package com.ignacio.dongbao.ums;

import com.ignacio.dongbaocommonbase.exception.DongbaoException;
import com.ignacio.dongbao.ums.entity.UmsMember;


/**
 *<h1>User 管理基础(crud)服务定义</h1>
 */
public interface IUserManageSystemBaseService {

    /**
     * <h2>单个新增用户</h2>
     * @param umsMember
     * @throws DongbaoException
     */
    void add(UmsMember umsMember) throws DongbaoException;

    /**
     * <h2>更新已有用户信息</h2>
     * @param umsMember
     * @throws DongbaoException
     */

    void update(UmsMember umsMember) throws DongbaoException;
}
