package com.partum.service;

import com.baomidou.mybatisplus.service.IService;
import com.partum.pojo.Employee;
import com.partum.pojo.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService extends IService<Employee> {
    int insertEmployee(Employee employee);
}
