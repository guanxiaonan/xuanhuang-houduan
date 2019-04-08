package com.gyn.gateway.service.impl;

import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.pojo.Types;
import com.gyn.gateway.service.AgriculturalService;
import org.springframework.stereotype.Component;

@Component
public class AgriculturalServiceImpl implements AgriculturalService {

    @Override
    public Result realDataGet() {
        Result result = new Result();
        result.setMessage("realDataGet fail");
        return result;
    }

    @Override
    public Result differentData(Types types) {
        Result result = new Result();
        result.setMessage("differrenGet fail");
        return result;
    }

}
