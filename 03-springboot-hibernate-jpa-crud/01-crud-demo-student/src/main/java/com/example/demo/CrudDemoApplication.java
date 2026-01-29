package com.example.demo;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

    static void main(String[] args) {
        SpringApplication.run(CrudDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createMultipleStudents(studentDAO);
//            readSudent(studentDAO, 2);
            queryForStudents(studentDAO);
//            queryForStudentsByLastName(studentDAO, "Marston");
//            updateStudent(studentDAO);
//            deleteStudent(studentDAO, 2);
            deleteAll(studentDAO);

        };
    }

    private void deleteAll(StudentDAO studentDAO) {
        int numRowsDeleted = studentDAO.deleteAll();
        System.out.println("Deleted row count: " + numRowsDeleted);
    }

    private void deleteStudent(StudentDAO studentDAO, int id) {
        if (studentDAO.findById(id) != null) {
            studentDAO.delete(id);

        }
        queryForStudents(studentDAO);
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 2;
        Student theStudent = studentDAO.findById(studentId);
        theStudent.setFirstName("JimBoy");
        theStudent.setLastName("Calloway");
        theStudent.setEmail("calloway@gmail.com");
        studentDAO.update(theStudent);
        System.out.println(theStudent);
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO, String lastName) {
        List<Student> theStudents = studentDAO.findByLastName(lastName);
        for (Student student : theStudents) {
            System.out.println(student.toString());
        }
    }

    private void queryForStudents(StudentDAO studentDAO) {
        List<Student> theStudents = studentDAO.findAll();
        for (Student student : theStudents) {
            System.out.println(student.toString());
        }
    }

    private void readSudent(StudentDAO studentDAO, Integer id) {
        Student foundStudent = studentDAO.findById(id);
        System.out.println(foundStudent.toString());
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        // create the student object
        System.out.println("Creating a new student object ...");
        Student tempStudent1 = new Student("John", "Marston", "john@gmail.com");
        Student tempStudent2 = new Student("Mary", "Linton", "linton@gmail.com");
        Student tempStudent3 = new Student("Arthur", "Morgan", "arthur@gmail.com");
        Student tempStudent4 = new Student("Dutch", "Vanderlind", "dutch@gamil.com");

        // save the student object
        System.out.println("Saving the students ...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
        studentDAO.save(tempStudent4);
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
