package com.partum.service.serviceImpl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.partum.dao.EmployeeDao;
import com.partum.pojo.Employee;
import com.partum.service.EmployeeService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, Employee> implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public int insertEmployee(Employee employee) {

        String hashAlgorithmName = "MD5";
        Integer hashIterations = 1024;
        Object credentials = employee.getEmpPassword();
        Object salt = employee.getEmpName();

        Object result =  new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
        System.out.println(result);
        employee.setEmpPassword((String) result);
        return 0;
    }
}
