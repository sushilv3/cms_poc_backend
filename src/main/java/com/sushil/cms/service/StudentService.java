package com.sushil.cms.service;

import com.sushil.cms.controller.StudentController;
import com.sushil.cms.entity.Student;
import com.sushil.cms.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentImpl {
    private final StudentRepository studentRepository;
    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);


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

    @Override
    public List<Student> saveStudents(List<Student> students) {
       return studentRepository.saveAll(students);

    }

    @Override
    public List<Student> findByCity(String city) {
        return studentRepository.findByCity(city);
    }
}
