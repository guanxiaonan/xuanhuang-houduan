package com.gyn.agriculturalData.service;

import com.gyn.agriculturalData.pojo.RealData;

import java.util.List;

public interface AgrituralDataService {
    List<RealData> RealdataGet();
    List<RealData> airTempdataGet();
    List<RealData> airHumidataGet();
    List<RealData> lightdataGet();
    List<RealData> soilTempdataGet();
    List<RealData> soilHumidataGet();
    List<RealData> co2dataGet();
}
