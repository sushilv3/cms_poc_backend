package com.sushil.cms.service;

import com.sushil.cms.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentImpl {

    public List<Student> getAll();

    public Optional<Student> findByStudentId(String id);

    public Student updateStudentById(String id, Student student);

    public void deleteStudentById(String id);

    public Student saveStudent(Student student);

}
