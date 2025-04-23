package com.spring.jpa.entity;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student_t")
@Setter
@Getter
public class StudentEntity {
    @Id
    @GeneratedValue
   public Integer id;
    @Column(name = "student_name")
    public String studentName;
    @Column(name = "student_email")
    public String StudentEmail;
    @Column(name = "student_age")
    public Integer studentAge;

}
