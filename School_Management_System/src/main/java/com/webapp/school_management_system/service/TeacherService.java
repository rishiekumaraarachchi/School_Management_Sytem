package com.webapp.school_management_system.service;

import java.util.List;
import com.webapp.school_management_system.entity.Teacher;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacherById (Long id);

    Teacher updateTeacher (Teacher teacher);

    void deleteTeacherById(Long id);

}
