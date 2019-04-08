package com.gyn.agriculturalData.service.impl;

import com.gyn.agriculturalData.mapper.AgriculturalDataMapper;
import com.gyn.agriculturalData.pojo.RealData;
import com.gyn.agriculturalData.service.AgrituralDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgrituralDataServiceImpl implements AgrituralDataService {

    @Autowired
    private AgriculturalDataMapper agriculturalDataMapper;
    @Override
    public List<RealData> RealdataGet() {
        return agriculturalDataMapper.RealdataGet();
    }

    @Override
    public List<RealData> airTempdataGet() {
        return agriculturalDataMapper.airTempdataGet();
    }

    @Override
    public List<RealData> airHumidataGet() {
        return agriculturalDataMapper.airHumidataGet();
    }

    @Override
    public List<RealData> lightdataGet() {
        return agriculturalDataMapper.lightdataGet();
    }

    @Override
    public List<RealData> soilTempdataGet() {
        return agriculturalDataMapper.soilTempdataGet();
    }

    @Override
    public List<RealData> soilHumidataGet() {
        return agriculturalDataMapper.soilHumidataGet();
    }

    @Override
    public List<RealData> co2dataGet() {
        return agriculturalDataMapper.co2dataGet();
    }


}
