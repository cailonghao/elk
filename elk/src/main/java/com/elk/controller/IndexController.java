package com.elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author cainiao
 * @program: elk
 * @description:
 * @create: 2020-07-06 10:03
 **/
@Slf4j
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/ask/{msg}")
    public String ask(@PathVariable String msg){
        log.info("用户发送了一个请求{}",msg);
        log.getClass();
        return "解决了:"+msg;
    }
}
