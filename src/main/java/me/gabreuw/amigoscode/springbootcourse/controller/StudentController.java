package me.gabreuw.amigoscode.springbootcourse.controller;

import me.gabreuw.amigoscode.springbootcourse.domain.Student;
import me.gabreuw.amigoscode.springbootcourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> findAll() {
        return service.findAll();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        service.insert(student);
    }

}
