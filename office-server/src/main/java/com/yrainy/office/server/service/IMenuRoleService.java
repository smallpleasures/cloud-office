package com.yrainy.office.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yrainy.office.server.entity.RespBean;
import com.yrainy.office.server.pojo.MenuRole;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanglun
 * @since 2022-01-09
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
