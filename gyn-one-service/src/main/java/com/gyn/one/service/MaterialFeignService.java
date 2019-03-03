package com.gyn.one.service;

import com.gyn.one.pojo.Material;
import com.gyn.one.pojo.Question;
import com.gyn.one.pojo.Result;
import com.gyn.one.pojo.Watering;
import com.gyn.one.service.impl.MaterialFeignServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;


/**
 * @Description:
 * @Date: Create at 10:01, 2017/12/15
 * @Author: Matthew
 */
@FeignClient(value = "gyn-material-service",fallback = MaterialFeignServiceHystrix.class)
public interface MaterialFeignService {

    @RequestMapping(value = "/material",method = RequestMethod.GET)
    public Result findList();

    @RequestMapping(value = "/soilGet",method = RequestMethod.GET)
    public Result soilGet();

    @RequestMapping(value = "data_get",method = RequestMethod.GET)
    public Result dataGet();

    @RequestMapping(value = "/air_get",method = RequestMethod.GET)
    public Result airGet();

    @RequestMapping(value = "/light_get",method = RequestMethod.GET)
    public Result lightGet();

    @RequestMapping(value = "/jiaoshui",method = RequestMethod.POST)
    public Result jiaoshuiPut(@RequestBody Watering watering);

    @RequestMapping(value = "/question_tijiao",method = RequestMethod.POST)
    public Result questionTijiao(@RequestBody Question question);

    @RequestMapping(value = "/question_get",method = RequestMethod.GET)
    public Result questionGet();

    @RequestMapping(value = "/material/page/{currentPageNo}/{pageSize}",method = RequestMethod.GET)
    public Result findByPage(@RequestHeader(value = "currentPageNo") int currentPageNo,
                             @RequestHeader(value = "pageSize")int pageSize);

    @RequestMapping(value = "/material/{id}",method = RequestMethod.GET)
    public Result findById(@RequestHeader(value = "id") Long id);

    @RequestMapping(value = "/material/type",method = RequestMethod.GET)
    public Result findTypeNameList();

    @RequestMapping(value = "/material/nameList",method = RequestMethod.GET)
    public Result findNameList();

    @RequestMapping(value = "/material",method = RequestMethod.POST)
    public Result add(@RequestBody Material material);

    @RequestMapping(value = "/material",method = RequestMethod.PUT)
    public Result update(@RequestBody Material material);

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test();

    //此处用@PathVariable 会报错,参数无法传过去,只能用@RequestHeader
    @RequestMapping(value = "/material/{id}",method = RequestMethod.DELETE)
    public Result delete(@RequestHeader(value = "id") Long id);

    @RequestMapping(value = "/material/totalNum",method = RequestMethod.GET)
    Result getTotal();

    @RequestMapping(value = "/material/type/{id}",method = RequestMethod.GET)
    Result findTypeNameById(@RequestHeader(value = "id") Long id);
}
