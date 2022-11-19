package com.chris.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChrisPeng
 * @date 2022/11/6 14:33
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
