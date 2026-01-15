package edu.icet.controller;

import edu.icet.service.StudentService;
import edu.icet.service.StudentServiceV1;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/get-name")
    public String getName(){
        return service.getName();
    }

    public String getVersion(){
        return service.getVersion();
    }
}
