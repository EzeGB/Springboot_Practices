package com.example.demo4;

import com.example.demo4.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class Demo4Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}

	@GetMapping
	public List<Student> printStudent(){
		return List.of(new Student(
				1L,
				"Ezequiel Gerstel Bodoha",
				"ezequielgerstel777@gmail.com",
				LocalDate.of(2001, Month.SEPTEMBER,24),
				23
				)
		);
	}
}
