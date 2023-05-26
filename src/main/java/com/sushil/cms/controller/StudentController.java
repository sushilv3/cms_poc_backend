package com.sushil.cms.controller;

import com.sushil.cms.entity.Student;
import com.sushil.cms.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student) {
        System.out.println("student "+ student);
        return studentService.saveStudent(student);
    }
    @PostMapping("/save")
    public List<Student> saveStudents(@RequestBody List<Student> students) {
        logger.info("student "+ students);
        return studentService.saveStudents(students);
    }
    @GetMapping("/")
    public List<Student> getAllStudent() {
        return studentService.getAll();
    }
    @GetMapping("/findByCity/{city}")
    public List<Student> findByCity( @PathVariable String city) {
        return studentService.findByCity(city);
    }
}
