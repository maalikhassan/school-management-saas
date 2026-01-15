package edu.icet.service;

import edu.icet.dto.StudentDto;

import java.util.List;

public interface StudentService {

    public String getVersion();
    public String getName();

    public void addStudent(StudentDto studentDto);
    public void updateStudent(StudentDto studentDto);
    public void deleteStudent(Integer id);
    public StudentDto searchById(Integer id);

    List<StudentDto> getAllStudents();
    List<StudentDto> searchStudentsByName(String name);
}
