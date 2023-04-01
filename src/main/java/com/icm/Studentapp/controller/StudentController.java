package com.icm.Studentapp.controller;

import com.icm.Studentapp.dto.request.RequestStudentDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    @PostMapping("/create")
    public String saveStudent(@RequestBody RequestStudentDto dto){return dto.toString();
    }
    @GetMapping("/{id}")
    public String findStudent(@PathVariable String id){
        return "find student";
    }
    @DeleteMapping(params = "id")
    public String deleteStudent(@RequestParam String id){
        return "delete student";
    }//
    @PutMapping
    public String updateStudent(@RequestBody RequestStudentDto dto,@RequestParam String id){
        return "update student";
    }
    @GetMapping(path = "/list", params = {"page","size"})
    public String findAllStudent(@RequestParam int page,int size){
        return "find student";
    }
}
