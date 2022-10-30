package com.webapp.school_management_system.controller;

import com.webapp.school_management_system.entity.Teacher;
import com.webapp.school_management_system.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeacherController {

    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {

        this.teacherService = teacherService;
    }

    //handler method to handle list of teachers
    @GetMapping("/teachers")
    public String listTeachers(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teachers";
    }

    //adding new teacher
    @GetMapping("/teachers/new")
    public String createTeacherForm(Model model) {
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "create_teacher";
    }

    @PostMapping("/teachers")
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/edit/{id}")
    public String editTeacherForm(@PathVariable Long id, Model model){
        model.addAttribute("teacher",teacherService.getTeacherById(id));
        return "edit_teacher";
    }

    @PostMapping("/teachers/{id}")
    public String updateTeacher(@PathVariable Long id, @ModelAttribute("teacher") Teacher teacher, Model model) {
        //get Teacher from database by id
        Teacher existingTeacher= teacherService.getTeacherById(id);
        existingTeacher.setId(id);
        existingTeacher.setTeacherId(teacher.getTeacherId());
        existingTeacher.setFullName(teacher.getFullName());
        existingTeacher.setHomeAddress(teacher.getHomeAddress());
        existingTeacher.setContactNumber(teacher.getContactNumber());
        existingTeacher.setEmail(teacher.getEmail());
        existingTeacher.setSubject(teacher.getSubject());

        //save updated Teacher object
        teacherService.updateTeacher(existingTeacher);
        return "redirect:/teachers";
    }

    //handler method to handle delete teacher request
    @GetMapping("teachers/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacherById(id);
        return "redirect:/teachers";
    }
}

