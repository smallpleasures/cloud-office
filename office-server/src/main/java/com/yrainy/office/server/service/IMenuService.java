package com.yrainy.office.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yrainy.office.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanglun
 * @since 2022-01-09
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 根据用户id获取菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId();

    /**
     * 根据所有菜单（包含角色）
     * @return
     */
    List<Menu> getMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
