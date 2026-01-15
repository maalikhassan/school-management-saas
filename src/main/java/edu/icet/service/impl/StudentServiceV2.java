package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class StudentServiceV2 implements StudentService {
    @Autowired
    StudentRepository repository;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addStudent(StudentDto studentDto) {

        StudentEntity studentEntity = mapper.map(studentDto,StudentEntity.class);
        repository.save(studentEntity);

    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        repository.save(mapper.map(studentDto,StudentEntity.class));
    }

    @Override
    public void deleteStudent(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public StudentDto searchById(Integer id) {
        StudentEntity studentEntity = repository.findById(id).get();
        StudentDto studentDto = mapper.map(studentEntity,StudentDto.class);
        return studentDto;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<StudentEntity> studentEntityList = repository.findAll();

        ArrayList<StudentDto> studentDtoArrayList = new ArrayList<>();

        studentEntityList.forEach(studentEntity -> {
            StudentDto studentDto = mapper.map(studentEntity,StudentDto.class);
            studentDtoArrayList.add(studentDto);
        });
        return  studentDtoArrayList;
    }

    @Override
    public List<StudentDto> searchStudentsByName(String name) {
        return List.of();
    }

    @Override
    public String getVersion() {
        return "v2.0.0";
    }

    @Override
    public String getName() {
        return "Student Xyz from V2";
    }
}
