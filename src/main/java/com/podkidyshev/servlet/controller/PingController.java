package com.podkidyshev.servlet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PingController {

    @GetMapping()
    public String hello() {
        return "Start page";
    }



    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }

}
