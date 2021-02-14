package me.gabreuw.amigoscode.springbootcourse.service;

import me.gabreuw.amigoscode.springbootcourse.domain.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
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
