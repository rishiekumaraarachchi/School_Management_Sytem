package com.webapp.school_management_system.controller;

import com.webapp.school_management_system.entity.Marks;
import com.webapp.school_management_system.service.MarksService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MarksController {

    private MarksService marksService;

    public MarksController(MarksService marksService) {

        this.marksService = marksService;
    }

    //handler method to handle list of students
    @GetMapping("/marks")
    public String listMarks(Model model) {
        model.addAttribute("marks", marksService.getAllMarks());
        return "marks";
    }





}
