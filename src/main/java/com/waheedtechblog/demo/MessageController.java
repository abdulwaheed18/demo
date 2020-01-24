package com.waheedtechblog.demo;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class MessageController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MessageController.class);

    @GetMapping("/{name}")
    public String getMessage(@PathVariable String name){
        return " Hi " + name + " .";

    }
}
