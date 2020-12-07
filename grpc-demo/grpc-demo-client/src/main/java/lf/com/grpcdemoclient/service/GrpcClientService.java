package lf.com.grpcdemoclient.service;

import lf.com.grpcdemoclient.domain.InterruptStatusVo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author linfan
 * @Date 2020/12/7 16:36
 * @Version 1.0
 */

public interface GrpcClientService {

    String sendMessage(String name);


}
