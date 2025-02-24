package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.Impl.StudentServiceImpl;
import edu.icet.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentManagementController {

    StudentServiceImpl service=new StudentServiceImpl();

    @GetMapping("/get")
    public List<Student> getName() {

        return service.get;
    }
}
