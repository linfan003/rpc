package lf.com.grpcdemoserver.controller;

import io.grpc.stub.StreamObserver;
import lf.com.grpcdemolib.lib.GreeterGrpc;
import lf.com.grpcdemolib.lib.GreeterOuterClass;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @Author linfan
 * @Date 2020/12/7 17:30
 * @Version 1.0
 */
@GrpcService
public class HelloServerController extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        String message = "Hello " + request.getName();
        final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
        System.out.println(message);
    }
}
