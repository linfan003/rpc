package com.lf.dubbodemoserver.service.impl;

import com.lf.dubbodemoserver.service.DubboDemoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author linfan
 * @Date 2020/12/8 14:23
 * @Version 1.0
 */
@Service
public class DubboDemoServerImpl implements DubboDemoServer {
    @Override
    public String getName(String id) {
        String name =id+ "test";
        return name;
    }
}
