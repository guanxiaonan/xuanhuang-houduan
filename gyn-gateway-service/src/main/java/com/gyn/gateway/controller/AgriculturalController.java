package com.gyn.gateway.controller;

import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.pojo.Types;
import com.gyn.gateway.service.AgriculturalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AgriculturalController {

    @Autowired
    private AgriculturalService agriculturalService;

    @RequestMapping(value="/real_data-get",method = RequestMethod.GET)
    public Result realDataGet(){
        return agriculturalService.realDataGet();
    }

    @RequestMapping(value = "/all_data-get",method = RequestMethod.POST)
    public Result differentData(@RequestBody Types type){
        return agriculturalService.differentData(type);
    }
}
