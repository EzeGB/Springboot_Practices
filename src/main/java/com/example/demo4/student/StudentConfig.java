package com.example.demo4.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ezequielGerstelBodoha = new Student(
                    "Ezequiel Gerstel Bodoha",
                    "ezequielgerstel777@gmail.com",
                    LocalDate.of(2001, Month.SEPTEMBER, 24),
                    23
            );
            Student priscilaGerstelBodoha = new Student(
                    "Priscila Gerstel Bodoha",
                    "chichilitagerstel@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 16),
                    12
            );
            repository.saveAll(List.of(
                    ezequielGerstelBodoha,
                    priscilaGerstelBodoha
            ));
        };
    }
}
