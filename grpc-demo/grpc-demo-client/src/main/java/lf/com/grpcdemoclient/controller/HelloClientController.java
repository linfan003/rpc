package lf.com.grpcdemoclient.controller;

import lf.com.grpcdemoclient.service.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author linfan
 * @Date 2020/12/7 16:42
 * @Version 1.0
 */
@RestController
public class HelloClientController {
    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/")
    public String printMessage(@RequestParam(defaultValue = "Susan") String name) {
        System.out.println("开始调用");
        String s = grpcClientService.sendMessage(name);
        System.out.println("调用成功");
        return s;
    }

}
