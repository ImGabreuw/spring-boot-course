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

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        service.delete(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ) {
        service.update(studentId, name, email);
    }

}
