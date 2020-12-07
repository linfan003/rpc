package lf.com.grpcdemoclient.service.impl;


import lf.com.grpcdemoclient.service.GrpcClientService;
import lf.com.grpcdemolib.lib.GreeterGrpc;
import lf.com.grpcdemolib.lib.GreeterOuterClass;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import io.grpc.Channel;

/**
 * @Author linfan
 * @Date 2020/12/7 16:44
 * @Version 1.0
 */
@Service
public class GrpcClientServiceImpl implements GrpcClientService {
    //两种获取Channel方式
    //方法一
    @GrpcClient("local-grpc-server")
    private Channel serverChannel;
    @Override
    public String sendMessage(String name) {
        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(serverChannel);
        GreeterOuterClass.HelloReply response = stub.sayHello(GreeterOuterClass.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }

}
