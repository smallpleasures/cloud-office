package com.yrainy.office.server.controller;

import com.yrainy.office.server.entity.ChatMsg;
import com.yrainy.office.server.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

/**
 * @author: zhanglun
 * @since: 1.0.0
 */

@Controller
public class WsController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/ws/chat")
    public void handleMsg(Authentication authentication, ChatMsg chatMsg){
        Admin admin = (Admin) authentication.getPrincipal(); // 获取当前用户对象
        chatMsg.setFrom(admin.getUsername()); // 登录用户名
        chatMsg.setFormNickName(admin.getName()); // 显示用户名
        chatMsg.setDate(LocalDateTime.now());
        // 发送消息 参数：发送给谁，队列名，消息内容
        simpMessagingTemplate.convertAndSendToUser(chatMsg.getTo(), "/queue/chat", chatMsg);

    }
}
