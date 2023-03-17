package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: ProductApp
 * Package: com.atguigu.gmall
 * Description:
 * 商品微服务启动类
 *
 * @Author coderhyh
 * @Create 2023/3/17 20:35
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApp {

    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class, args);
    }
}
