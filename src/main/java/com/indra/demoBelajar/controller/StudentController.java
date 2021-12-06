package com.indra.demoBelajar.controller;

import java.util.List;

import com.indra.demoBelajar.model.StudentModel;
import com.indra.demoBelajar.repository.StudentRepository;
import com.indra.demoBelajar.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")

//penghubung antara frontEnd dan backend
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public String add(@RequestBody StudentModel studentModel){
        studentService.saveStudentModel(studentModel);
        return "New Student is added";
    }

    @GetMapping("/getAll")
    @ResponseStatus(code = HttpStatus.OK)
    public List<StudentModel> getAllStudentsModels(){
        return studentService.getAllStudentsModels();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public String delete(@PathVariable Integer id){
        studentService.hapusStudentModel(this.studentRepository.cariid(id));
        return "Data berhasil di hapus";
    }

    @PutMapping("/edit")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public String edit (@RequestBody StudentModel studentModel){
        studentService.saveStudentModel(studentModel);
        return "Data berhasil di edit";
    }
    
}
