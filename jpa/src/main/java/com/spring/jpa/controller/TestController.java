package com.spring.jpa.controller;

import com.spring.jpa.entity.StudentEntity;
import com.spring.jpa.model.Student;
import com.spring.jpa.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("getStudents")
    public List<StudentEntity> getStudentDetails(){
        return testService.getStudentDetails();
    }

}
