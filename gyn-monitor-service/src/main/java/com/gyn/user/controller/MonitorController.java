package com.gyn.user.controller;

import com.gyn.user.Constant.Constant;
import com.gyn.user.pojo.Monitor;
import com.gyn.user.pojo.Result;
import com.gyn.user.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Date: Create at 16:28, 2017/12/18
 * @Author: Matthew
 */
@RestController
public class MonitorController {

    @Autowired
    private MonitorService monitorService;

    /**
     * 获取物料列表
     * @return
     */
    @RequestMapping(value = "/monitor",method = RequestMethod.GET)
    public Result findList() {
        Result result = new Result();
        List<Monitor> list = null;
        try {
            list = monitorService.getTodayCallTimes();
            System.out.println(list);
            result.setCode(Constant.SUCCESS_CODE);
            result.setMessage(Constant.SUCCESS_MESSAGE);
            result.setData(list);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Constant.FAIL_CODE);
            result.setMessage(Constant.FAIL_MESSAGE);
        }
        return result;
    }
}
