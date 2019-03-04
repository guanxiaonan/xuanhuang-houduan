package com.gyn.gateway.pojo;

/**
 * @Description: 采集数据
 * @Date: Create at 16:11, 2017/12/13
 * @Author: Matthew
 */
public class RealData {

    private Long id;
    private String types;
    private String dev_addr;
    private String data_name;
    private String datas;
    private String units;
    private String data_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getDev_addr() {
        return dev_addr;
    }

    public void setDev_addr(String dev_addr) {
        this.dev_addr = dev_addr;
    }

    public String getData_name() {
        return data_name;
    }

    public void setData_name(String data_name) {
        this.data_name = data_name;
    }

    public String getDatas() {
        return datas;
    }

    public void setDatas(String datas) {
        this.datas = datas;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getData_time() {
        return data_time;
    }

    public void setData_time(String data_time) {
        this.data_time = data_time;
    }
}
