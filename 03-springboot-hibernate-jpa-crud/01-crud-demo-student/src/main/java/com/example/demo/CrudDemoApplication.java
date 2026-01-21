package com.example.demo;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

    static void main(String[] args) {
        SpringApplication.run(CrudDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createMultipleStudents(studentDAO);
//            Student foundStudent = studentDAO.findById(3);
//            System.out.println(foundStudent.toString());
        };
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        // create the student object
        System.out.println("Creating a new student object ...");
        Student tempStudent1 = new Student("John", "Marston", "john@gmail.com");
        Student tempStudent2 = new Student("Mary", "Linton", "linton@gmail.com");
        Student tempStudent3 = new Student("Arthur", "Morgan", "arthur@gmail.com");

        // save the student object
        System.out.println("Saving the students ...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
    }

    private void createStudent(StudentDAO studentDAO) {
        // create the student object
        System.out.println("Creating a new student object ...");
        Student tempStudent = new Student("Mahdi", "Jafari", "mahdi@gmail.com");

        // save the student object
        System.out.println("Saving the student ...");
        studentDAO.save(tempStudent);

        // display id of the saved student
        System.out.println("Saved student. Generated Id: " + tempStudent.getId());
    }
}
