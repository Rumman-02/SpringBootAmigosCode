package project1.example.codeSpringBoot.student;

/*
This class is dedicated for the API works
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")  // Instead of going to localhost:8080, it will go > localhost:8080/api/v1/student
/*
It's for a clearPath
 */
public class StudentController {

    /*
    for Service Layer
     */
    private final StudentService studentService;  // A reference to "StudentService"

    @Autowired  // Dependency Injection from the "Service Layer"
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }




/*
For StudentController part
 */

//    public List<Student> getStudents(){
//        return List.of(
//                new Student(
//                        1L,
//                        "Mariam",
//                        "mariamJahan@gamil.com",
//                        LocalDate.of(2001, Month.DECEMBER,15),
//                        24
//
//                )
//        );
//    }
}
