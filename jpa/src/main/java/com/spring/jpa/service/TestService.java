package com.spring.jpa.service;

import com.spring.jpa.entity.StudentEntity;
import com.spring.jpa.model.Student;
import com.spring.jpa.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {
    private StudentRepository studentRepository;

    public TestService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudentDetails(){
        List<StudentEntity> studentEntityList = studentRepository.findAll();
        List<Student> studentList = new ArrayList<>();
        if(studentEntityList != null){
            for (int i = 0; i < studentEntityList.size(); i++) {
                Student student = new Student();
                student.setAge(studentEntityList.get(i).getStudentAge());
                student.setId(studentEntityList.get(i).getId());
                student.setEmal(studentEntityList.get(i).getStudentEmail());
                student.setName(studentEntityList.get(i).getStudentName());
                studentList.add(student);

            }
        }
        return studentList;
    }
}
