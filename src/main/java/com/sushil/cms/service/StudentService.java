package com.sushil.cms.service;

import com.sushil.cms.entity.Student;
import com.sushil.cms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentImpl {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findByStudentId(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student updateStudentById(Long id, Student student) {
        if (studentRepository.findById(id).isPresent()) {
            studentRepository.save(student);
        }
        return null;
    }

    @Override
    public void deleteStudentById(Long id) {
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
