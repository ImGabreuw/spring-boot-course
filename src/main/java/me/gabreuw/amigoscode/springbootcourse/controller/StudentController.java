package me.gabreuw.amigoscode.springbootcourse.controller;

import lombok.RequiredArgsConstructor;
import me.gabreuw.amigoscode.springbootcourse.domain.Student;
import me.gabreuw.amigoscode.springbootcourse.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "student")
@RequiredArgsConstructor
public class StudentController {

    private StudentService service;

    @GetMapping
    public List<Student> getStudents() {
        return service.getStudents();
    }

}
