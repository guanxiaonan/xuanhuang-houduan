package com.gyn.agriculturalData.pojo;

public class Types {
    private String types;
    /**
     * 土壤温度
     * 土壤温度
     * 空气温度
     * 空气湿度
     * 光照强度
     * 离子浓度
     * co2
     * @return
     */
    public final static String soilTemp = "soilTemp";
    public final static String soilHumi = "土壤湿度";
    public final static String airTemp = "空气温度";
    public final static String airHumi = "空气湿度";
    public final static String light = "光照强度";
    public final static String lizi = "离子浓度";
    public final static String co2 = "co2";


    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }
}
