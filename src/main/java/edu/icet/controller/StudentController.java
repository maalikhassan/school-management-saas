package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {


    final StudentService service;

    @GetMapping("/get-name")
    public String getName(){
        return service.getName();
    }

    @GetMapping("/get-version")
    public String getVersion(){
        return service.getVersion();
    }


    public void addStudent(StudentDto studentDto){
        service.addStudent(studentDto);
    }

    public void updateStudent(StudentDto studentDto){

    }
    public void deleteStudent(Integer id){

    }
    public StudentDto searchById(Integer id){

        return null;
    }

    List<StudentDto> getAllStudents(){

        return List.of();
    }
    List<StudentDto> searchStudentsByName(String name){

        return List.of();
    }
}
