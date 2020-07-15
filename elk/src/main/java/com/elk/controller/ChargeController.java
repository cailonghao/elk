package com.elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cainiao
 * @program: elk
 * @description:
 * @create: 2020-07-13 12:45
 **/
@Slf4j
@RestController
@RequestMapping("/charge")
public class ChargeController {

    @RequestMapping("/charge/{msg}")
    public String charge(@PathVariable Integer msg){
        log.info("用户充值:{}",msg);
        return "用户充值:"+msg;
    }
    @RequestMapping("/consume/{msg}")
    public String consume(@PathVariable Integer msg){
        log.info("用户消费:{}",msg);
        return "用户消费:"+msg;
    }
}
