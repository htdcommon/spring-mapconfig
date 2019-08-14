package com.sensetime.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@ConfigurationProperties("hadoop")
public class HadoopConfig {
    private Integer num;
    private String type;
    private HashMap<String,String> cluster;
    private String os;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HashMap<String, String> getCluster() {
        return cluster;
    }

    public void setCluster(HashMap<String, String> cluster) {
        this.cluster = cluster;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

}
