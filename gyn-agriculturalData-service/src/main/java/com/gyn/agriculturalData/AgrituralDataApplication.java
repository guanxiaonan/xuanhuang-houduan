package com.gyn.agriculturalData;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import net.minidev.json.writer.BeansMapper.Bean;

import java.util.Properties;

/**
 * @Description:
 * @Date: Create at 17:18, 2017/12/18
 * @Author: Matthew
 */
@SpringBootApplication
@EnableDiscoveryClient
@org.springframework.cloud.context.config.annotation.RefreshScope
public class AgrituralDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgrituralDataApplication.class, args);
    }

    //为了打包springboot项目
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

    //配置mybatis的分页插件pageHelper
//    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
