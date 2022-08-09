package com.example.springbootday;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomControllar {
    @RequestMapping(path = "/hey",method = RequestMethod.GET)
    public String getHey(){

        return "Hey from spring";
    }
    @RequestMapping(path = "/bye",method = RequestMethod.GET)
    public String getBye(){

        return "Bye";
    }
    @RequestMapping(path = "/check/status",method = RequestMethod.GET)
    public String check() {
        return "Everything OK";
    }
    @RequestMapping(path = "helth",method = RequestMethod.GET)
    public String helth() {
        return "server health is up and running";
    }


}
