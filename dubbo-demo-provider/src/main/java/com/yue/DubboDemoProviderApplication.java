package com.yue;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/6/4 16:23
 */
@SpringBootApplication
@NacosPropertySource(dataId = "provider")
public class DubboDemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboDemoProviderApplication.class, args);
    }
}
