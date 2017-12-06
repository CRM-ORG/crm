package com.partum.service;

import com.baomidou.mybatisplus.service.IService;
import com.partum.pojo.Employee;



public interface EmployeeService {
    Integer insertEmployee(Employee employee);
}
