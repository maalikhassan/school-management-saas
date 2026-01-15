package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
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

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDto studentDto){
        service.addStudent(studentDto);
    }
    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDto studentDto){
        service.updateStudent(studentDto);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        service.deleteStudent(id);
    }
    @GetMapping("/search/{id}")
    public StudentDto searchById(@PathVariable Integer id){
        return service.searchById(id);
    }
    @GetMapping("/get-all")
    List<StudentDto> getAllStudents(){
        return service.getAllStudents();
    }
    List<StudentDto> searchStudentsByName(String name){
        return List.of();
    }
}
