package edu.icet.service;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceV1 implements StudentService {

    @Override
    public String getVersion() {
        return "v1.0.0";
    }

    @Override
    public String getName() {
        return "Student Xyz";
    }
}
