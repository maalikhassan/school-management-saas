package edu.icet.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StudentServiceV2 implements StudentService{
    @Override
    public String getVersion() {
        return "v2.0.0";
    }

    @Override
    public String getName() {
        return "Student Xyz from V2";
    }
}
