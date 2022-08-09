package com.example.springbootday;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontrollar {
    @RequestMapping(path = "/name",method = RequestMethod.GET)
    public String getName(){

        return "majd naser";
    }
    @RequestMapping(path = "/id",method = RequestMethod.GET)
    public String getId(){

        return "1094780879";
    }
    @RequestMapping(path = "/num",method = RequestMethod.GET)
    public String getPhone_num() {
        return "0595826470";
    }
}
