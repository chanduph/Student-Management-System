package com.example.studentportal.service;

import com.example.studentportal.model.Student;
import com.example.studentportal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Optional<Student> getStudentByUsn(String usn) {
        return studentRepository.findById(usn);
    }
}
