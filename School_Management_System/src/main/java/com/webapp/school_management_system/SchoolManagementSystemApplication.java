package com.webapp.school_management_system;

import com.webapp.school_management_system.entity.Student;
import com.webapp.school_management_system.entity.Teacher;
import com.webapp.school_management_system.repository.StudentRepository;
import com.webapp.school_management_system.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void run(String... args) throws Exception {

//        Student student1 = new Student("001", "Kasun","Kandy","0114567823", "kasun@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("002","Sanjay","Matale", "0714567823","sanjay@gmail.com");
//        studentRepository.save(student2);
//
//        Teacher teacher1 = new Teacher("001","Ajan","Colombo", "0758964123","ajan@gmail.com","sinhala");
//        teacherRepository.save(teacher1);

    }

}
