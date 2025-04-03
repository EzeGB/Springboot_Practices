package com.example.demo4.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
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
