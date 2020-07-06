package com.fan.common.controller;

import com.alibaba.fastjson.JSONObject;
import com.fan.common.domain.Version;
import com.fan.common.service.StoreService;
import com.fan.core.common.RestBody;
import com.fan.core.common.RestHeader;
import com.fan.dao.trade.RelativeRepository;
import com.fan.entity.trade.Stores;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("/common")
public class CommonController {
    @Resource
    StoreService storeService;
    @Resource
    RelativeRepository relativeRepository;



    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public RestHeader getVersion() {

        RestBody<Version> data=new RestBody();
        Version version=new Version();
        version.setVersion("1.11");
        version.setId(1L);
        data.setData(version);
        return data;
    }

    @RequestMapping(value = "/store/test", method = RequestMethod.GET)
    public RestHeader saveStore() {
        RestBody data=new RestBody();
        Stores stores=new Stores();
        stores.setName("Test Store");
        stores.setPhone("123456123");
        stores.setRetailerName("add test name");
        storeService.insertSelective(stores);

        List<Stores> bean=storeService.selectByName(stores.getName());
        log.info("query store:{}", bean);
        return data;
    }


}
