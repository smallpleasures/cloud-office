package com.yrainy.office.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yrainy.office.server.pojo.Role;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanglun
 * @since 2022-01-09
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id获取角色列表
     * @param adminId
     * @return
     */
    List<Role> getRolesByAdminId(Integer adminId);
}
