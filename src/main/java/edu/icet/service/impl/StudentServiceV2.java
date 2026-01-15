package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class StudentServiceV2 implements StudentService {
    @Autowired
    StudentRepository repository;

    @Autowired
    ModelMapper mapper;


    @Override
    public String getVersion() {
        return "v2.0.0";
    }

    @Override
    public String getName() {
        return "Student Xyz from V2";
    }

    @Override
    public void addStudent(StudentDto studentDto) {

        StudentEntity studentEntity = mapper.map(studentDto,StudentEntity.class);
        repository.save(studentEntity);

    }

    @Override
    public void updateStudent(StudentDto studentDto) {

    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public StudentDto searchById(Integer id) {
        return null;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return List.of();
    }

    @Override
    public List<StudentDto> searchStudentsByName(String name) {
        return List.of();
    }
}
