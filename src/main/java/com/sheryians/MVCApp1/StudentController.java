package com.sheryians.MVCApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{rollno}")
    public Student getStudent(@PathVariable int rollno) {
        return studentService.getStudent(rollno);
    }

    @DeleteMapping("/students/{rollno}")
    public void deleteStudent(@PathVariable int rollno) {
        studentService.removeStudent(rollno);
    }
    @PostMapping("/register")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
    @PutMapping("/update/{rollno}")
    public void update(@RequestBody Student student, @PathVariable int rollno) {
        studentService.updateStudent(student, rollno);
    }
}
