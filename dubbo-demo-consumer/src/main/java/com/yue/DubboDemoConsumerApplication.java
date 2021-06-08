package com.yue;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/6/4 16:22
 */
@SpringBootApplication
@NacosPropertySource(dataId = "consumer")
public class DubboDemoConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboDemoConsumerApplication.class, args);
    }
}
