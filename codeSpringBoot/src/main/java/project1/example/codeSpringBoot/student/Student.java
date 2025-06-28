package project1.example.codeSpringBoot.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

/*
Connecting to the database
 */
@Entity // For the hibernated
@Table  // For the table of the database
public class Student {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private long id;
    private String name;
    private String email;
    private LocalDate dob; // date of birth
    @Transient
    private int age;

    public Student(){

    }

    // Calling a constructor for get() and set() methods

    public Student(String name, String email, LocalDate dob){
        this.name=name;
        this.email=email;
        this.dob=dob;

    }


    public Student( String name, LocalDate dob, String email) {
        this.dob = dob;
        this.email = email;
        this.name = name;
    }

    void setId(int id){
        this.id=id;
    }
    public long getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    void setDob(LocalDate dob){
        this.dob=dob;
    }
    public LocalDate getDob(){
        return dob;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return Period.between(this.dob, LocalDate.now()).getYears(); // dob=date of Birth
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}



/*
Using Lombok
 */
//
//package project1.example.codeSpringBoot.student;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDate;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Student {
//    private long id;
//    private String name;
//    private String email;
//    private LocalDate dob; // date of birth
//    private int age;
//}
