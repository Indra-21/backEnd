package com.indra.demoBelajar.service;

import java.util.List;

import com.indra.demoBelajar.model.StudentModel;

public interface StudentService {
    public StudentModel saveStudentModel(StudentModel studentModel);
    public List<StudentModel> getAllStudentsModels();
    public void hapusStudentModel(StudentModel studentModel);

}
