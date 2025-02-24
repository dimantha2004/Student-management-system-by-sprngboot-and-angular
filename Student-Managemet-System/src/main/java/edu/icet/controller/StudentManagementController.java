package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.Impl.StudentServiceImpl;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentManagementController {

    @Autowired
    StudentService service;

    @GetMapping("/getAll")
    public List<Student> getAll() {


        return service.getAll();
    }
    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){

        service.addStudent(student);
    }

    @GetMapping("/search/{Id}")
    public Student search(@PathVariable Integer Id) {


        return service.search(Id);
    }
    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student){
        StudentService.update(student);
    }

}
