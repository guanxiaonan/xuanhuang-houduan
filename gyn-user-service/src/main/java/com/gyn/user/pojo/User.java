package com.gyn.user.pojo;

/**
 * @Description: 物料基本信息实体类
 * @Date: Create at 16:11, 2017/12/13
 * @Author: Matthew
 */
public class User {

    private int id;
    private String username;
    private String password;
    private String phone;
    private int job_id;
    private String job_types;
    private int is_work;  //1 工作 2 请假
    private int role_id;   //1管理员 2 普通用户

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getJob_types() {
        return job_types;
    }

    public void setJob_types(String job_types) {
        this.job_types = job_types;
    }

    public int getIs_work() {
        return is_work;
    }

    public void setIs_work(int is_work) {
        this.is_work = is_work;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password=" + password + '\'' +
                ", phone=" + phone + '\'' +
                ", job_types=" + job_types + '\'' +
                ", is_work=" + is_work + '\'' +
                ", role_id=" + role_id +
                '}';
    }
}
