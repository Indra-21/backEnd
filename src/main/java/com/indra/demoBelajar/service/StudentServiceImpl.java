package com.indra.demoBelajar.service;

import java.util.List;

// import javax.persistence.Id;

import com.indra.demoBelajar.model.StudentModel;

import com.indra.demoBelajar.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentModel saveStudentModel(StudentModel studentModel) {
        return studentRepository.save(studentModel);
    }

    @Override
    public List<StudentModel> getAllStudentsModels() {
        return studentRepository.findAll();
    }

    @Override
    public void hapusStudentModel(StudentModel studentModel) {
        studentRepository.delete(studentModel);
        
    }

    // @Override
    // public void hapusStudentModel(StudentModel studentModel) {
    //     studentRepository.delete(studentModel);
    // }


    

}
