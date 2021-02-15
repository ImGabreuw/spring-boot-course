package me.gabreuw.amigoscode.springbootcourse.repository;

import me.gabreuw.amigoscode.springbootcourse.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    /* OUTRAS FORMAS PARA RECUPERAR UMA ALUNO POR EMAIL:

     - SELECT * FROM student WHERE email = ?

     - @Query("SELECT s FROM Student s WHERE s.email = ?1")
       Optional<Student> findByEmail(String email);
     */

    Optional<Student> findStudentByEmail(String email);

}