package com.webapp.school_management_system.controller;

import com.webapp.school_management_system.entity.Student;
import com.webapp.school_management_system.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    //handler method to handle list of students and return model and view
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";//return a view
    }

    //adding new student
    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        //create student object to hold studet from data
        Student student = new Student();
        model.addAttribute("student", student);//key , value
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/student/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
        //get student from database by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setIndexNo(student.getIndexNo());
        existingStudent.setFullName(student.getFullName());
        existingStudent.setHomeAddress(student.getHomeAddress());
        existingStudent.setContactNumber(student.getContactNumber());
        existingStudent.setEmail(student.getEmail());

        //save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    //handler method to handle delete student request
    @GetMapping("students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }


    @GetMapping ("/students/add/{id}")
    public String addMarks(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "add_marks";
    }





}
