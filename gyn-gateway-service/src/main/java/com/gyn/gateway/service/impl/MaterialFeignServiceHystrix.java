package com.gyn.gateway.service.impl;

import com.gyn.gateway.Constant.Constant;
import com.gyn.gateway.pojo.Material;
import com.gyn.gateway.pojo.Question;
import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.pojo.Watering;
import com.gyn.gateway.service.MaterialFeignService;
import org.springframework.stereotype.Component;


/**
 * @Description:
 * @Date: Create at 21:19, 2017/12/20
 * @Author: Matthew
 */
@Component
public class MaterialFeignServiceHystrix implements MaterialFeignService {

    @Override
    public Result findList() {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result soilGet(){
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("soil:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result airGet(){
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("air:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result dataGet(){
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("传感器数据:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result lightGet(){
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("light:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result jiaoshuiPut(Watering watering){
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("jiaoashui:" + Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result questionTijiao(Question question){
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("questiontijiao:" + Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result questionGet(){
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("questionGet:" + Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result findByPage(int currentPageNo, int pageSize) {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result findById(Long id) {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result findTypeNameList() {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }
    @Override
    public Result findNameList() {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result add(Material material) {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result update(Material material) {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result delete(Long id) {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result getTotal() {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result findTypeNameById(Long id) {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Material:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public String test() {
        return "MaterialFeignServiceHystrix:test";
    }
}
