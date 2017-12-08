package com.partum.dao;

import com.partum.pojo.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao  {

    Integer insertEmployee(Employee employee);

}
