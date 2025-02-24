package edu.icet.service.Impl;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceImpl implements StudentService {


    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public List<Student> getAll() {
        return List.of();
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public Student search(Integer id) {

        return null;
    }


}
