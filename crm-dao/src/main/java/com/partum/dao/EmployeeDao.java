package com.partum.dao;

import com.partum.pojo.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao {
    int insertEmployee(Employee employee);
}
