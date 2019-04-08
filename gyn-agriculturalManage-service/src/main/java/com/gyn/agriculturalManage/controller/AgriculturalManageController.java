package com.gyn.agriculturalManage.controller;

import com.gyn.agriculturalManage.Constant.Constant;
import com.gyn.agriculturalManage.pojo.Result;
import com.gyn.agriculturalManage.pojo.Task;
import com.gyn.agriculturalManage.pojo.TaskType;
import com.gyn.agriculturalManage.pojo.TaskUnits;
import com.gyn.agriculturalManage.service.AgriculturalManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AgriculturalManageController {
    @Autowired private AgriculturalManageService agriculturalManageService;

    @GetMapping(value = "/task_type-get")
    public Result taskTypeGet(){
        Result result = new Result();
        List<TaskType> taskTypesList= null;
        try{
            taskTypesList = agriculturalManageService.taskTypeGet();
            if(taskTypesList == null){
                result.setCode(Constant.RES_NOT_EXIST_CODE);
                result.setMessage(Constant.RES_NOT_EXIST_MESSAGE);
                return result;
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(Constant.FAIL_CODE);
            result.setMessage(Constant.FAIL_MESSAGE);
        }
        result.setCode(Constant.SUCCESS_CODE);
        result.setMessage(Constant.SUCCESS_MESSAGE);
        result.setData(taskTypesList);
        return result;
    }

    @GetMapping(value = "/task_units-get")
    public Result taskUnitsGet(){
        Result result = new Result();
        List<TaskUnits> taskUnitsList= null;
        try{
            taskUnitsList = agriculturalManageService.taskUnitsGet();
            if(taskUnitsList == null){
                result.setCode(Constant.RES_NOT_EXIST_CODE);
                result.setMessage(Constant.RES_NOT_EXIST_MESSAGE);
                return result;
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(Constant.FAIL_CODE);
            result.setMessage(Constant.FAIL_MESSAGE);
        }
        result.setCode(Constant.SUCCESS_CODE);
        result.setMessage(Constant.SUCCESS_MESSAGE);
        result.setData(taskUnitsList);
        return result;
    }

    @PostMapping(value = "/task-post")
    public Result taskInput(@RequestBody Task task){
        Result result = new Result();
        Date date = new Date();
        task.setTask_time(date);
        task.setUser_id(1);
        try {
            agriculturalManageService.taskInput(task);
            result.setCode(Constant.SUCCESS_CODE);
            result.setMessage(Constant.SUCCESS_MESSAGE);
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(Constant.FAIL_CODE);
            result.setMessage(Constant.FAIL_MESSAGE);
        }
        return result;
    }


}
