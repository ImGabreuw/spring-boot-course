package me.gabreuw.amigoscode.springbootcourse;

import me.gabreuw.amigoscode.springbootcourse.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

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
