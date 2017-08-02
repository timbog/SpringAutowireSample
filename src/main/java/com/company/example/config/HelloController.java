package com.company.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bogdan1 on 02.08.2017.
 */

@RestController
public class HelloController {

    @Autowired
    NameService service;

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "hello " + service.politeName(name);
    }

}
