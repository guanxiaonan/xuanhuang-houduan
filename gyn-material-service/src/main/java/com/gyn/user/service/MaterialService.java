package com.gyn.user.service;

import com.gyn.user.pojo.*;
import com.gyn.user.pojo.MaterialType;

import java.util.List;

/**
 * @Description:
 * @Date: Create at 10:01, 2017/12/15
 * @Author: Matthew
 */
public interface MaterialService {

    void add(Material material);

    void update(Material material);

    void delete(Long id);

    void jiaoshuiPut(Watering watering);

    void questionTijiao(Question question);

    Material findById(Long id);

    List<Soil> soilGet();

    List<Air> airGet();

    List<Light> lightGet();

    List<RealData> dataGet();

    List<Question> questionGet();

    List<Material> findList();

    List<MaterialType> findTypeNameList();

    List<Material> findItemByPage(int currentPageNo,int pageSize);

    int getTotal();

    List<Material> findNameList();

    MaterialType findTypeNameById(Long id);
}
