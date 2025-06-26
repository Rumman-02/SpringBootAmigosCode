package project1.example.codeSpringBoot.student;

import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private String email;
    private LocalDate dob; // date of birth
    private int age;

    // Calling a constructor for get() and set() methods

    public Student(long id, String name, String email, LocalDate dob, int age){
        this.id=id;
        this.name=name;
        this.email=email;
        this.dob=dob;
        this.age=age;
    }


    public Student(int age, LocalDate dob, String email, String name) {
        this.age = age;
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

    void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    void setEamil(String email){
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

    void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
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
