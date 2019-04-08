package com.gyn.gateway.service;

import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.pojo.Task;
import com.gyn.gateway.service.impl.AgriculturalManageServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "gyn-agriculturalManage-service",fallback =AgriculturalManageServiceHystrix.class)
public interface AgriculturalManageService {

    @RequestMapping(value = "/task_type-get",method = RequestMethod.GET)
    public Result taskTypeGet();

    @RequestMapping(value = "task-post",method = RequestMethod.POST)
    public Result taskInput(@RequestBody Task task);

    @RequestMapping(value = "/task_units-get",method = RequestMethod.GET)
    public Result taskUnitsGet();
}
