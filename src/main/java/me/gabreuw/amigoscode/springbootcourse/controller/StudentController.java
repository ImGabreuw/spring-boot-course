package me.gabreuw.amigoscode.springbootcourse.controller;

import me.gabreuw.amigoscode.springbootcourse.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController {

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "marian.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );
    }

}
