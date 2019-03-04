package com.gyn.gateway.service.impl;

import com.gyn.gateway.Constant.Constant;
import com.gyn.gateway.pojo.InventoryRecord;
import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.service.InventoryFeignService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Date: Create at 21:19, 2018/02/20
 * @Author: Matthew
 */
@Component
public class InventoryFeignServiceHystrix implements InventoryFeignService{

    @Override
    public Result add(InventoryRecord inventoryRecord) {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Inventory:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result test() {
        Result result = new Result();
        result.setCode(9002);
        result.setMessage("Inventory:test");
        return result;
    }

    @Override
    public Result findByPage(int currentPageNo, int pageSize) {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Inventory:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result getTotal() {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Inventory:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }

    @Override
    public Result findList() {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Inventory:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }
}
