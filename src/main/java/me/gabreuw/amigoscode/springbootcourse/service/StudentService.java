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

    public void insert(Student student) {
        boolean isInvalidEmail = repository
                .findStudentByEmail(student.getEmail())
                .isPresent();

        if (isInvalidEmail) {
            throw new IllegalArgumentException("Email taken.");
        }

        repository.save(student);
    }

    public void delete(Long studentId) {
        Student student = repository
                .findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Student with id " + studentId + " does not exists"));

        repository.delete(student);
    }
}
