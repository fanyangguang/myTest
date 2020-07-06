package com.fan.core.util;

import com.sohu.idcenter.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.InetAddress;

@Component
@Slf4j
public class IdGenerator {

    private static IdGenerator ID_GENERATOR;

    private IdWorker idWorker;

    @Value("${spring.application.name}")
    private String appName;

    @PostConstruct
    void init() throws Exception{
        String id= InetAddress.getLocalHost()+":"+appName+":"+Math.random();
        long idepoch= System.identityHashCode(id);
        log.info("Generator unique id [{}] ,idepoch [{}]",id,idepoch);
        idWorker= new IdWorker(idepoch);
        ID_GENERATOR= this;
    }

    public static String next() {
        String id =ID_GENERATOR.idWorker.getId()+"";
        log.debug("next id {}",id);
        return id;
    }
}
