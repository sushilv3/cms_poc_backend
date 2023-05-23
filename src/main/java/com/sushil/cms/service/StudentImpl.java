package com.sushil.cms.service;

import com.sushil.cms.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentImpl {

    public List<Student> getAll();

    public Optional<Student> findByStudentId(Long id);

    public Student updateStudentById(Long id, Student student);

    public void deleteStudentById(Long id);

    public Student saveStudent(Student student);

}
