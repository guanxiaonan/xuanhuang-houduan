package com.gyn.gateway.pojo;

import java.util.Date;

/**
 * @Description  浇水操作记录表
 */
public class Watering {
    private long waterId;
    private float waterNum;
    private int teagarId;
    private String teagarName;
    private Date waterDate;
    private String waterRemark;

    public long getWaterId() {
        return waterId;
    }

    public void setWaterId(long waterId) {
        this.waterId = waterId;
    }

    public float getWaterNum() {
        return waterNum;
    }

    public void setWaterNum(float waterNum) {
        this.waterNum = waterNum;
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

    public Date getWaterDate() {
        return waterDate;
    }

    public void setWaterDate(Date waterDate) {
        this.waterDate = waterDate;
    }

    public String getWaterRemark() {
        return waterRemark;
    }

    public void setWaterRemark(String waterRemark) {
        this.waterRemark = waterRemark;
    }
}
