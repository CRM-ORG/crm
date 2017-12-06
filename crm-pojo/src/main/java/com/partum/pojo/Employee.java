package com.partum.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;

/**
 * 员工实体类
 * @since 2017-12-06
 */
public class Employee extends Model<Employee> {

    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
	@TableId(value="emp_id", type= IdType.AUTO)
	private Long empId;
    /**
     * 员工姓名
     */
	@TableField("emp_name")
	private String empName;
    /**
     * 员工密码
     */
	@TableField("emp_password")
	private String empPassword;
    /**
     * 员工邮箱
     */
	@TableField("emp_email")
	private String empEmail;
    /**
     * 员工手机号码
     */
	@TableField("emp_moblie")
	private String empMoblie;
    /**
     * 员工最后一次登录时间
     */
	@TableField("last_login")
	private Date lastLogin;
    /**
     * 员工创建时间
     */
	@TableField("gmt_create")
	private Date gmtCreate;
    /**
     * 员工修改时间
     */
	@TableField("gmt_modified")
	private Date gmtModified;


	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpMoblie() {
		return empMoblie;
	}

	public void setEmpMoblie(String empMoblie) {
		this.empMoblie = empMoblie;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	protected Serializable pkVal() {
		return this.empId;
	}

	@Override
	public String toString() {
		return "Employee{" +
			"empId=" + empId +
			", empName=" + empName +
			", empPassword=" + empPassword +
			", empEmail=" + empEmail +
			", empMoblie=" + empMoblie +
			", lastLogin=" + lastLogin +
			", gmtCreate=" + gmtCreate +
			", gmtModified=" + gmtModified +
			"}";
	}
}
