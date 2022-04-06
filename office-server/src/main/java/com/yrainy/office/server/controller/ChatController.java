package com.yrainy.office.server.controller;

import com.yrainy.office.server.pojo.Admin;
import com.yrainy.office.server.service.IAdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 在线聊天
 * @author: zhanglun
 * @since: 1.0.0
 */

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private IAdminService adminService;

    @ApiOperation(value = "获取可用的所有操作员")
    @GetMapping("/admin")
    public List<Admin> getAllAdmins(String keywords){
        // 调用 getAllEnabledAdmins 方法
        return adminService.getAllEnabledAdmins(keywords);
    }
}
