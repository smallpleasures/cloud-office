package com.yrainy.office.server.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yrainy.office.server.entity.RespBean;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.resource.HttpResource;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 当访问接口没有权限时，自定义返回结果类
 * @author: zhanglun
 * @since: 1.0.0
 */

@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        RespBean bean = RespBean.error("权限不足，请联系管理员");
        bean.setCode(HttpStatus.FORBIDDEN.value());
        out.write(new ObjectMapper().writeValueAsString(bean));
        out.flush();
        out.close();
    }
}
