package me.gabreuw.amigoscode.springbootcourse.service;

import me.gabreuw.amigoscode.springbootcourse.domain.Student;
import me.gabreuw.amigoscode.springbootcourse.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student findById(Long studentId) {
        return repository
                .findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Student with id " + studentId + " does not exists"));
    }

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
        Student entity = this.findById(studentId);

        repository.delete(entity);
    }

    @Transactional
    public void update(Long studentId, String name, String email) {
        Student entity = this.findById(studentId);

        entity.setName(checkName(
                name,
                entity.getName()
        ));
        entity.setEmail(checkEmail(
                email,
                entity.getEmail()
        ));

    }

    public String checkName(String newName, String defaultName) {
        if (newName == null) return defaultName;

        if (newName.length() == 0) return defaultName;

        if (newName.equals(defaultName)) return defaultName;

        return newName;
    }

    public String checkEmail(String newEmail, String defaultEmail) {
        if (newEmail == null) return defaultEmail;

        if (newEmail.length() == 0) return defaultEmail;

        if (newEmail.equals(defaultEmail)) return defaultEmail;

        Optional<Student> studentOptional = repository.findStudentByEmail(newEmail);

        if (studentOptional.isPresent()) return defaultEmail;

        return newEmail;
    }
}
