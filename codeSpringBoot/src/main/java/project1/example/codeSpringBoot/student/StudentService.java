package project1.example.codeSpringBoot.student;

/*
 Service layer > mainly responsible for business logics
 */

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


//@Component
@Service  // Here it is meant to be the "Service class"
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariamJahan@gamil.com",
                        LocalDate.of(2001, Month.DECEMBER,15),
                        24
                )
        );
    }
}
