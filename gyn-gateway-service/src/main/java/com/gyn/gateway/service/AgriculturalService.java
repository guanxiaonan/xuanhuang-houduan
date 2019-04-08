package com.gyn.gateway.service;

import com.gyn.gateway.pojo.Result;
import com.gyn.gateway.pojo.Types;
import com.gyn.gateway.service.impl.AgriculturalServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="gyn-agriculturalData-service" ,fallback = AgriculturalServiceImpl.class)
public interface AgriculturalService {
    @RequestMapping(value="/real_data-get",method = RequestMethod.GET)
    public Result realDataGet();

    @RequestMapping(value = "all_data-get",method = RequestMethod.POST)
    public Result differentData(@RequestBody Types types);
}
