package com.yrainy.office.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yrainy.office.server.entity.RespBean;
import com.yrainy.office.server.pojo.Department;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanglun
 * @since 2022-01-09
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 获取所有部门
     * @param
     * @return
     */
    List<Department> getAllDepartments(int parentId);

    /**
     * 添加部门
     * @param dep
     * @return
     */
    void addDep(Department dep);

    /**
     * 删除部门
     * @param dep
     */
    void deleteDep(Department dep);
}
