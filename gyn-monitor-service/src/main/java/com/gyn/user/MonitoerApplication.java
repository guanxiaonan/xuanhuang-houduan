package com.gyn.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Description:
 * @Date: Create at 17:18, 2017/12/18
 * @Author: Matthew
 */
@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
//@RefreshScope
public class MonitoerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitoerApplication.class, args);
    }

    //为了打包springboot项目
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
