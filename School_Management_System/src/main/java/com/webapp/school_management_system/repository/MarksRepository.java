package com.webapp.school_management_system.repository;

import com.webapp.school_management_system.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepository extends JpaRepository<Marks, Long> {
}