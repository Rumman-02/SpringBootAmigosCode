package project1.example.codeSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project1.example.codeSpringBoot.student.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

/*
@RestController will be used here only if we do not use "Restful API"
 */
//@RestController

public class CodeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeSpringBootApplication.class, args);
	}

//	@GetMapping
//	public String hello(){
//		return "Hello World";
//    }



//	@GetMapping
//	public List<String> hello1(){
//		return List.of("hello", "World");
//	}



//	@GetMapping()
//	public List<Student> details(){
//		return List.of(
//				new Student(1L, "Mariam", "mariamjahan@gmail.com", LocalDate.of(2000, Month.FEBRUARY,12), 21)
//		);
//	}



//	/*
//	Not using toString()
//	 */
//	@GetMapping
//	public Student details(){
//		return new Student(
//				1L,
//				"Mariam",
//				"mariamJahan@gamil.com",
//				24)
//				;
//	}

}
