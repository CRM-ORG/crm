package com.partum.service.serviceImpl;


import com.partum.dao.EmployeeDao;
import com.partum.pojo.Employee;
import com.partum.service.EmployeeService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDao employeeDao;
@Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao=employeeDao;
    }




    @Override
    public Integer insertEmployee(Employee employee) {
        /**
         * 选择加密方式为新增的员工密码进行加密
         * 使用MD5方式并且迭代1024次进行加密
         */
        String hashAlgorithmName = "MD5";
        Integer hashIterations = 1024;
        Object credentials = employee.getEmpPassword();
        Object salt = employee.getEmpName();
        /**
         * 使用shiro自带的加密方法
         */
        Object result =  new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
        System.out.println(result);
        employee.setEmpPassword(result.toString());
        return employeeDao.insertEmployee(employee);
    }
}
