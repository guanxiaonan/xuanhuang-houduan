package com.gyn.one.pojo;

import java.util.Date;

/**
 * @Description: 反馈功能
 * @Date: Create at 16:11, 2017/12/13
 * @Author: Matthew
 */
public class Question {
    private long quesId;
    private int teagarId;
    private String teagarName;
    private String picture;
    private String user;
    private int statId;
    private String status;
    private String quesDescribe;

    public long getQuesId() {
        return quesId;
    }

    public void setQuesId(long quesId) {
        this.quesId = quesId;
    }

    public int getTeagarId() {
        return teagarId;
    }

    public void setTeagarId(int teagarId) {
        this.teagarId = teagarId;
    }

    public String getTeagarName() {
        return teagarName;
    }

    public void setTeagarName(String teagarName) {
        this.teagarName = teagarName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getStatId() {
        return statId;
    }

    public void setStatId(int statId) {
        this.statId = statId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuesDescribe() {
        return quesDescribe;
    }

    public void setQuesDescribe(String quesDescribe) {
        this.quesDescribe = quesDescribe;
    }
}
