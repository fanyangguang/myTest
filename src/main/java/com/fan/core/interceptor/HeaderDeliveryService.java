package com.fan.core.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class HeaderDeliveryService {

    @Resource
    private List<HeaderDeliveryInterceptor> interceptors;

    public Map<String,String> headers(){
        Map<String,String> headers= new HashMap<>();
        for(HeaderDeliveryInterceptor each: interceptors){
            each.makeup(headers);
        }
        log.info("service delivery headers: {}",headers);
        return headers;
    }
}
