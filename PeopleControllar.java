package com.example.springbootday;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleControllar {

    ArrayList<String> people=new ArrayList<>();



    @GetMapping("/people")
    public ArrayList getUser(){
        return people;
    }


    @PostMapping("/people")
    public String addUser(@RequestBody String peoples){
        people.add(peoples);
        return "New Name added to the list";
    }


    @PutMapping("/people/{index}")
    public String updateUser(@PathVariable int index,@RequestBody String name){
        people.set(index,name);
        return "list updated";
    }



    @DeleteMapping("/people/{index}")
    public String deleteuser(@PathVariable int index){
        people.remove(index);
        return "name deleted from the list";
    }



}
