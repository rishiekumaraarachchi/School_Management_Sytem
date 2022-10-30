package com.webapp.school_management_system.service;


import com.webapp.school_management_system.entity.Marks;
import com.webapp.school_management_system.repository.MarksRepository;
import com.webapp.school_management_system.service.MarksService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksServiceImpl implements MarksService{

    private MarksRepository marksRepository;

    public MarksServiceImpl(MarksRepository marksRepository) {
        super();
        this.marksRepository=marksRepository;
    }

    @Override
    public List<Marks> getAllMarks() {
        return marksRepository.findAll();
    }

    @Override
    public Marks saveMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    @Override
    public Marks getMarksById(Long id) {
        return marksRepository.findById(id).get();
    }

    @Override
    public Marks updateMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    @Override
    public void deleteMarksById(Long id) {
        marksRepository.deleteById(id);
    }


}
