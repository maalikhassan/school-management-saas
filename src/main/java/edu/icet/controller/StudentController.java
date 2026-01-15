package edu.icet.controller;

import edu.icet.service.StudentServiceV1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/get-student")
    public String getStudentName(){
        return new StudentServiceV1().getStudentName();
    }
}
