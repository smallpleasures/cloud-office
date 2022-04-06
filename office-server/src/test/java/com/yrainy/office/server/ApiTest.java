package com.yrainy.office.server;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhanglun
 * @since: 1.0.0
 */

public class ApiTest {

    @Test
    public void testCollections() {
        List<String> list = new ArrayList<>();
        list.add("hah");
        Assert.assertTrue(list.contains(new String("hah")));
    }

    @Test
    public void testCal() {
        System.out.println("xd012" + 1);
    }
}
