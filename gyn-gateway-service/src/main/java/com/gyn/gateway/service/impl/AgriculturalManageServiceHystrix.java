package com.gyn.gateway.service.impl;

import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.pojo.Task;
import com.gyn.gateway.service.AgriculturalManageService;
import org.springframework.stereotype.Component;

@Component
public class AgriculturalManageServiceHystrix implements AgriculturalManageService {

    @Override
    public Result taskTypeGet() {
        Result result = new Result();
        result.setMessage("taskTypeGet fail");
        return result;
    }

    @Override
    public Result taskInput(Task task) {
//        Result result = new Result();
//        result.setMessage("taskInput fail");
//        return result;
        return GetMessage("taskInput fail");
    }

    @Override
    public Result taskUnitsGet() {
        return GetMessage("taskUnitsGet fail");
    }

    public Result GetMessage(String message){
        Result result = new Result();
        result.setMessage(message);
        return result;
    }
}
