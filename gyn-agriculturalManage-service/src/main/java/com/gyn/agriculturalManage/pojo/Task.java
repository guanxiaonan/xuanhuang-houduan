package com.gyn.agriculturalManage.pojo;

import java.util.Date;

/**
 * 茶农每日作业表
 */
public class Task {
    private long task_id;
    private long user_id;
    private String username;
    private long task_types_id;
    private String task_type;  //类型
    private String task_units;  //操作的衡量单位
    private String task_data;
    private Date task_time;
    private String garden;   //茶园号
    private String beizhu;

    public long getTask_id() {
        return task_id;
    }

    public void setTask_id(long task_id) {
        this.task_id = task_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getTask_types_id() {
        return task_types_id;
    }

    public void setTask_types_id(long task_types_id) {
        this.task_types_id = task_types_id;
    }

    public String getTask_type() {
        return task_type;
    }

    public void setTask_type(String task_type) {
        this.task_type = task_type;
    }

    public String getTask_units() {
        return task_units;
    }

    public void setTask_units(String task_units) {
        this.task_units = task_units;
    }

    public String getTask_data() {
        return task_data;
    }

    public void setTask_data(String task_data) {
        this.task_data = task_data;
    }

    public Date getTask_time() {
        return task_time;
    }

    public void setTask_time(Date task_time) {
        this.task_time = task_time;
    }

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
