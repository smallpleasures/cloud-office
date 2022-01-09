package com.yrainy.office.server.controller;


import com.yrainy.office.server.pojo.Menu;
import com.yrainy.office.server.service.IAdminService;
import com.yrainy.office.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhanglun
 * @since 2022-01-09
 */
@RestController
@RequestMapping("/system/cfg")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @ApiOperation(value = "通过用户id查询菜单列表")
    @GetMapping("/menu")
    public List<Menu> getMenusByAdminId(){
        // 只要登录，用户信息存在 security 全局对象中，从全局对象中获取用户id
        return menuService.getMenusByAdminId();
    }
}
