package com.sushil.cms.service;

import com.sushil.cms.entity.Student;

import java.util.List;

public interface StudentImpl {

    public List<Student> getAll();

    public Student findByStudentId(String id);

    public Student updateStudentById(String id);

    public Student deleteStudentById(String id);

}
