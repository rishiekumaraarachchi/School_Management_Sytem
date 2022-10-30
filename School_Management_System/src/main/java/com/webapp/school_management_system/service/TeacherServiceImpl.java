package com.webapp.school_management_system.service;

import com.webapp.school_management_system.entity.Teacher;
import com.webapp.school_management_system.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements  TeacherService{

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        super();
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() { return teacherRepository.findAll(); }

    @Override
    public Teacher saveTeacher(Teacher teacher) { return teacherRepository.save(teacher);}

    @Override
    public Teacher getTeacherById(Long id) { return teacherRepository.findById(id).get(); }

    @Override
    public Teacher updateTeacher(Teacher teacher) { return teacherRepository.save(teacher); }

    @Override
    public void deleteTeacherById(Long id) { teacherRepository.deleteById(id); }
}
