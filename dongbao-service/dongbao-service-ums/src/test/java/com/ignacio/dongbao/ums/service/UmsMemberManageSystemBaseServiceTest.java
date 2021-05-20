package com.ignacio.dongbao.ums.service;

import com.ignacio.dongbao.ums.IUserManageSystemBaseService;
import com.ignacio.dongbaocommonbase.constant.UserStatus;
import com.ignacio.dongbaocommonbase.exception.DongbaoException;
import com.ignacio.dongbao.ums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/5/20 at 13:58
 */

@SpringBootTest
public class UmsMemberManageSystemBaseServiceTest {

    @Autowired
    private IUserManageSystemBaseService userManageSystemBaseService;

    @Test
    void testAddSingleUmsMember() throws DongbaoException {
        UmsMember umsMember = new UmsMember();
        umsMember.setNickname("HHHHH");
        umsMember.setEmail("hhhhh@moneed.net");
        umsMember.setPassword("123456");
        umsMember.setCreateTime(new Date(System.currentTimeMillis()));
        umsMember.setIcon("Icon");
        umsMember.setStatus(UserStatus.of(1));
        umsMember.setLoginTime(new Date());
        umsMember.setModifiedTime(new Date());
        umsMember.setNote("test");
        umsMember.setUsername("H John");
        userManageSystemBaseService.add(umsMember);
    }

    @Test
    void updateUmsMember() throws DongbaoException{
        UmsMember umsMember = new UmsMember
                (61,"Jane","123456","icon","jane@123.com","jane","test",0);

        userManageSystemBaseService.update(umsMember);
    }

}
