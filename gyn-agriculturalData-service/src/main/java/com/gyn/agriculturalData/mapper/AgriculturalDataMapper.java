package com.gyn.agriculturalData.mapper;

import com.gyn.agriculturalData.pojo.RealData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AgriculturalDataMapper {
    //获取总实时数据
    @Select("select * from real_time_data where data_time >'2019-03-07 19:38:27' and data_time <'2019-03-08' limit 1000")
    List<RealData> RealdataGet();

    //查询各个属性的值
    //空气温度
    @Select("select * from real_time_data where data_time >'2019-03-06' and data_time <'2019-03-08' and " +
            "types = 'SHT21/SHT25温湿度传感器' and data_name = '温度' limit 1000")
    List<RealData> airTempdataGet();
    //空气湿度
    @Select("select * from real_time_data where data_time >'2019-03-06' and data_time <'2019-03-08' and " +
            "types = '光照探测器' limit 1000")
    List<RealData> lightdataGet();
    //光照
    @Select("select * from real_time_data where data_time >'2019-03-06' and data_time <'2019-03-08' and " +
            "types = 'SHT21/SHT25温湿度传感器' and data_name = '湿度' limit 1000")
    List<RealData> airHumidataGet();
    //土壤温度
    @Select("select * from real_time_data where data_time >'2019-03-06' and data_time <'2019-03-08' and " +
            "types = '土壤温度传感器' limit 1000")
    List<RealData> soilTempdataGet();
    //土壤湿度
    @Select("select * from real_time_data where data_time >'2019-03-06' and data_time <'2019-03-08' and " +
            "types = '土壤湿度传感器' limit 1000")
    List<RealData> soilHumidataGet();
    //co2浓度
    @Select("select * from real_time_data where data_time >'2019-03-06' and data_time <'2019-03-08' and " +
            "types = 'CO2传感器' limit 1000")
    List<RealData> co2dataGet();
    /**
     * 将数据插入对应的表，且查询对应的数据
     */
//    @Insert("insert into air_data value #{types},#{dev_addr},#{data_name},#{datas" +
//            ",#{units},#{data_time}}")
//    void airDataInsert();
//
//    @Select("select * from air_data limit 10000")
//    List<RealData> airDataGet();
//
//    @Insert("insert into soilTemp_data value #{types},#{dev_addr},#{data_name},#{datas" +
//            ",#{units},#{data_time}}")
//    void soilTempDataInsert();
//
//    @Select("select * from soilTemp_data limit 10000")
//    List<RealData> soilTempDataGet();
//
//    @Insert("insert into soilHumidity_data value #{types},#{dev_addr},#{data_name},#{datas" +
//            ",#{units},#{data_time}}")
//    void soilHumidityDataInsert();
//
//    @Select("select * from soilHumidity_data limit 10000")
//    List<RealData> soilHumidityDataGet();
//
//    @Insert("insert into light_data value #{types},#{dev_addr},#{data_name},#{datas" +
//            ",#{units},#{data_time}}")
//    void illuminationDataInsert();
//
//    @Select("select * from light_data limit 10000")
//    List<RealData> illuminationDataGet();
//
//    @Insert("insert into co2_data value #{types},#{dev_addr},#{data_name},#{datas" +
//            ",#{units},#{data_time}}")
//    void co2DataInsert();
//
//    @Select("select * from co2_data limit 10000")
//    List<RealData> co2DataGet();
    //将数据插入对应的表，且查询对应的数据

}
