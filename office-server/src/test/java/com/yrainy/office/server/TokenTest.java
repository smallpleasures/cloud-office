package com.yrainy.office.server;

import com.yrainy.office.server.config.security.JwtTokenUtil;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * @author: zhanglun
 * @since: 1.0.0
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class TokenTest {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    DataSource dataSource;

    @Test
    public void testGetUsernameFromToken() {
        User user = new User("张三", "123", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        String token = jwtTokenUtil.generateToken(user);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        System.out.println(username);
    }

    @Test
    public void testDataSource() {
        System.out.println(dataSource);
    }

    @Test
    public void test() {
        System.out.println("hah ");
    }
}
