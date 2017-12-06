package com.partum.pojo;
public class Employee {
    private Long empId;//员工id
    private java.util.Date gmtCreate;//员工创建时间
    private String empMoblie;//员工手机号码
    private Integer gender;//性别
    private java.util.Date lastLogin;//员工最后一次登录时间
    private String empName;//员工姓名
    private String realName;//登录名称
    private String adress;//地址
    private Integer isDelete;//是否删除
    private String nativePlace;
    private java.util.Date gmtUpdate;//员工修改时间
    private String empPassword;//员工密码
    private String empEmail;//员工邮箱
    public Employee() {
        super();
    }
    public Employee(Long empId,java.util.Date gmtCreate,String empMoblie,Integer gender,java.util.Date lastLogin,String empName,String realName,String adress,Integer isDelete,String nativePlace,java.util.Date gmtUpdate,String empPassword,String empEmail) {
        super();
        this.empId = empId;
        this.gmtCreate = gmtCreate;
        this.empMoblie = empMoblie;
        this.gender = gender;
        this.lastLogin = lastLogin;
        this.empName = empName;
        this.realName = realName;
        this.adress = adress;
        this.isDelete = isDelete;
        this.nativePlace = nativePlace;
        this.gmtUpdate = gmtUpdate;
        this.empPassword = empPassword;
        this.empEmail = empEmail;
    }
    public Long getEmpId() {
        return this.empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public java.util.Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(java.util.Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getEmpMoblie() {
        return this.empMoblie;
    }

    public void setEmpMoblie(String empMoblie) {
        this.empMoblie = empMoblie;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public java.util.Date getLastLogin() {
        return this.lastLogin;
    }

    public void setLastLogin(java.util.Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getNativePlace() {
        return this.nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public java.util.Date getGmtUpdate() {
        return this.gmtUpdate;
    }

    public void setGmtUpdate(java.util.Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public String getEmpPassword() {
        return this.empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpEmail() {
        return this.empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

}
