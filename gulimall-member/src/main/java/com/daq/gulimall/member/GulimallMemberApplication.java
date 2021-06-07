package com.daq.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 远程调用其他服务
 * 1. 引入oprn-fegin
 * 2. 编写一个接口，告诉springcloud，这个接口需要远程调用服务。
 * 3. 声明接口中的每一个方法都是哪个远程服务调用的那个请求
 * 4. @EnableFeignClients开启远程调用功能(只要一启动，就去自动扫描这个包下所有标明了feginclient的方法)
 */

@EnableFeignClients(basePackages = "com.daq.gulimall.member.fegin")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
