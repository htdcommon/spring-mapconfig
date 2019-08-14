package com.sensetime.spring.controller;

import com.sensetime.spring.config.HadoopConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class HadoopController {

    @Autowired
    private HadoopConfig hadoopConfig;

    @RequestMapping(value = "/hadoop",method = RequestMethod.GET)
    public String getHadoop() {
        for(Map.Entry<String,String> entry:hadoopConfig.getCluster().entrySet()) {
            log.info(entry.getKey());
            log.info(entry.getValue());

        }

        log.info(hadoopConfig.getType());
        log.info(hadoopConfig.getNum().toString());
        log.info(hadoopConfig.getOs());
        return "hello hadoop";
    }
}
