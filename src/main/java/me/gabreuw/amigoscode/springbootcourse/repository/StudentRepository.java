package me.gabreuw.amigoscode.springbootcourse.repository;

import me.gabreuw.amigoscode.springbootcourse.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {}