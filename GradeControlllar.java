package com.example.springbootday;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class GradeControlllar {
    ArrayList<String> grades=new ArrayList<>();



    @GetMapping("/grade")
    public ArrayList getgrade(){
        return grades;
    }


    @PostMapping("/grade")
    public String addgrade(@RequestBody String grade){
        grades.add(grade);
        return "New grade added to the list";
    }


    @PutMapping("/grade/{index}")
    public String updategrade(@PathVariable int index, @RequestBody String grade){
        grades.set(index,grade);
        return "grades updated";
    }



    @DeleteMapping("/grade/{index}")
    public String deletegrade(@PathVariable int index){
        grades.remove(index);
        return "grade deleted from the list";
    }

}
