package com.lf.dubbodemoclient.Controller;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.lf.dubbodemoserver.service.DubboDemoServer;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author linfan
 * @Date 2020/12/8 14:31
 * @Version 1.0
 */
@RestController
@EnableDubboConfiguration
@Component
public class HelloController {


    /**
     * Reference是dubbo提供的远程调用的注解
     * 表示需要远程调用服务者的DubboDemoServer服务
     */
    @Reference
    private DubboDemoServer dubboDemoServer;

    @RequestMapping("/test")
    public @ResponseBody String test() {
        return dubboDemoServer.getName("啦啦啦");
    }
}
