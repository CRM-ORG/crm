package com.partum.controller;

import com.partum.pojo.Employee;
import com.partum.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lime on 2017/11/30
 */
@Controller
public class TestController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/shiro/Employee/add")
    public int addEmployee(Employee employee){
        employee.setEmpName("peter");
        employee.setEmpPassword("123456");
        return employeeService.insertEmployee(employee);
    }
}
