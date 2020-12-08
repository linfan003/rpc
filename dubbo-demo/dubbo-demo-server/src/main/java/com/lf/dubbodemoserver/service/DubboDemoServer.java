package com.lf.dubbodemoserver.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author linfan
 * @Date 2020/12/8 14:21
 * @Version 1.0
 */

public interface DubboDemoServer {
    /**
     * 根据id获取用户名
     * @param id
     * @return
     */
    String getName(String id);
}
