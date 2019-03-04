package com.gyn.gateway.service.impl;

import com.gyn.gateway.Constant.Constant;
import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.pojo.TaskParam;
import com.gyn.gateway.service.TaskFeignService;
import org.springframework.stereotype.Component;

@Component
public class TaskFeignServiceHystrix implements TaskFeignService {
    @Override
    public Result addTask(TaskParam task) {
        return setReturnMsg();
    }

    public Result test() {
        return setReturnMsg();
    }

    public Result findByPage(int currentPageNo, int pageSize) {
        return setReturnMsg();
    }

    public Result getTotal() {
        return setReturnMsg();
    }

    @Override
    public Result findTaskInfos() {
        return setReturnMsg();
    }

    public Result findList() {
        return setReturnMsg();
    }

    public Result update(TaskParam task) {
        return setReturnMsg();
    }

    public Result findById(Long id) {
        return setReturnMsg();
    }

    public Result delete(Long id) {
        return setReturnMsg();
    }

    public Result pauseProduceTask(Long id) {
        return setReturnMsg();
    }

    public Result resumeProduceTask(Long id) {
        return setReturnMsg();
    }

    private Result setReturnMsg() {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("Task:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }
}
