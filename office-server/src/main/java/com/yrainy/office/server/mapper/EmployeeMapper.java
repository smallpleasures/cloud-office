package com.yrainy.office.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yrainy.office.server.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanglun
 * @since 2022-01-09
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    /**
     * 获取所有员工分页
     * @param page
     * @param employee
     * @param beginDateScope
     * @return
     */
    Page<Employee> getEmployeeByPage(Page<Employee> page, @Param("employee") Employee employee, @Param("beginDateScope") LocalDate[] beginDateScope);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);

    /**
     * 获取所有员工账套分页
     * @param page
     * @return
     */
    Page<Employee> getEmployeeWithSalary(Page<Employee> page);
}
