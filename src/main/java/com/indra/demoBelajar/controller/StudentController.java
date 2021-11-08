package com.indra.demoBelajar.controller;

import java.util.List;

import com.indra.demoBelajar.model.StudentModel;
import com.indra.demoBelajar.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")

//penghubung antara frontEnd dan backend
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody StudentModel studentModel){
        studentService.saveStudentModel(studentModel);
        return "New Student is added";
    }

    @GetMapping("/getAll")
    public List<StudentModel> getAllStudentsModels(){
        return studentService.getAllStudentsModels();
    }
    
}
