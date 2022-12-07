package com.indra.demoBelajar.repository;

import com.indra.demoBelajar.model.StudentModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

    @Query("SELECT S FROM StudentModel S WHERE id=?1")
    StudentModel cariid(Integer id);
    
//    ini leny
}
