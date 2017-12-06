package com.partum.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.partum.pojo.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends BaseMapper<Employee> {
    int insertEmployee(Employee employee);

}
