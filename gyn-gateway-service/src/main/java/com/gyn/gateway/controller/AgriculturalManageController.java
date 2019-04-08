package com.gyn.gateway.controller;

import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.pojo.Task;
import com.gyn.gateway.service.AgriculturalManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgriculturalManageController {
    @Autowired
    private AgriculturalManageService agriculturalManageService;
    @RequestMapping(value = "/task_type-get",method = RequestMethod.GET)
    public Result taskTypeGet(){
        return agriculturalManageService.taskTypeGet();
    }

    @RequestMapping(value = "task-post",method = RequestMethod.POST)
    public Result taskInput(@RequestBody Task task){
        return agriculturalManageService.taskInput(task);
    }

    @RequestMapping(value = "/task_units-get",method = RequestMethod.GET)
    public Result taskUnitsGet(){
        return agriculturalManageService.taskUnitsGet();
    }
}
