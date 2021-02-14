package me.gabreuw.amigoscode.springbootcourse.service;

import me.gabreuw.amigoscode.springbootcourse.domain.Student;
import me.gabreuw.amigoscode.springbootcourse.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> findAll() {
        return repository.findAll();
    }

}
