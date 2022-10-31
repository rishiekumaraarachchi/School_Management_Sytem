package com.webapp.school_management_system.repository;
import com.webapp.school_management_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
//@Repository annotation is in the sSimpleJpaRepository
public interface StudentRepository extends JpaRepository<Student, Long> {
}// type of primary key and
