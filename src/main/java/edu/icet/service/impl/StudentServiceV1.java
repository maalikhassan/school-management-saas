package edu.icet.service.impl;

import edu.icet.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceV1 { // removed 'implements StudentService'


    public String getVersion() {
        return "v1.0.0";
    }


    public String getName() {
        return "Student Xyz";
    }
}
