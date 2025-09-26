package com.yassine.cidockerfile.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RestApi {

    @GetMapping("getFMessage")
    public String getFMessage(){
        return "get Message 1";
    }

    @GetMapping("getSMessage")
    public String getSMessage(){
        return "get Message 2";
    }

    @GetMapping("getTMessage")
    public String getTMessage(){
        return "get Message 3";
    }
}
