package com.partum.service;

import com.partum.pojo.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    int insertEmployee(Employee employee);
}
