package com.example.demo4.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
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
