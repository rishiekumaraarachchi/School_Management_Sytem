package com.webapp.school_management_system.service;

import java.util.List;

import com.webapp.school_management_system.entity.Marks;

public interface MarksService {
    List<Marks> getAllMarks();

    Marks saveMarks(Marks marks);

    Marks getMarksById(Long id);

    Marks updateMarks(Marks marks);

    void deleteMarksById(Long id);
}

