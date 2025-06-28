package project1.example.codeSpringBoot.student;

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
        return args-> {
                    Student mariam=new Student(
                            "Mariam",
                            "mariam@gmail.com",
                            LocalDate.of(2000,Month.FEBRUARY,21)
                    );

            Student alex=new Student(
                    "Alex",
                    "Alexm@gmail.com",
                    LocalDate.of(2004,Month.JUNE,11)
            );

            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
