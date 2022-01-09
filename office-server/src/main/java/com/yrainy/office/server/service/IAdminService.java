package com.yrainy.office.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yrainy.office.server.entity.RespBean;
import com.yrainy.office.server.pojo.Admin;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanglun
 * @since 2022-01-09
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUsername(String username);
}
