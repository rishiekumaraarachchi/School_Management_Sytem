package com.webapp.school_management_system.repository;

import com.webapp.school_management_system.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}


