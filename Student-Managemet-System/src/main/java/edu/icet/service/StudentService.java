package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {


    static void update(Student student) {
    }

    void updateStudent(Student student);

    List<Student> getAll();

    void addStudent(Student student);
    
    Student search(Integer id);
}


