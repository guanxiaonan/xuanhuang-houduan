package com.gyn.gateway.service.impl;

import com.gyn.gateway.Constant.Constant;
import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.pojo.User;
import com.gyn.gateway.service.UserFeignService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Date: Create at 21:19, 2017/12/20
 * @Author: Matthew
 */
@Component
public class UserFeignServiceHystrix implements UserFeignService {
    public String findNameById(Long id) {
        return "User: service error";
    }

    public String test() {
        return "MaterialFeignServiceHystrix:test";
    }

    public Result findList() {
        return setReturnMsg();
    }

    public Result findByPage(int currentPageNo, int pageSize) {
        return setReturnMsg();
    }

    public Result findById(Long id) {
        return setReturnMsg();
    }

    public Result add(User user) {
        return setReturnMsg();
    }

    public Result findPostList() {
        return setReturnMsg();
    }

    public Result update(User user) {
        return setReturnMsg();
    }

    public Result delete(Long id) {
        return setReturnMsg();
    }

    public Result getTotal() {
        return setReturnMsg();
    }

    public Result login(User user) {
        return setReturnMsg();
    }

    public Result logout() {
        return setReturnMsg();
    }

    private Result setReturnMsg() {
        Result result = new Result();
        result.setCode(Constant.SERVICE_NOT_ENABLE_CODE);
        result.setMessage("User:"+Constant.SERVICE_NOT_ENABLE_MESSAGE);
        return result;
    }
}
