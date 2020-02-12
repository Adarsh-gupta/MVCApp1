package com.sheryians.MVCApp1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> std = new ArrayList<Student>(
            Arrays.asList(new Student("Aman", 12),
                    new Student("Apoorva", 13),
                    new Student("Shivam", 14)));
    public List<Student> getAllStudents() {
        return std;
    }
    public Student getStudent(int rollno) {
        return std.stream().filter(s -> s.getRollNo()==rollno).findFirst().get();
    }
    public void removeStudent(int rollno){
        
        std.removeIf(student -> student.getRollNo()==rollno);
    }
    public void addStudent(Student student) {
        std.add(student);
    }
    public void updateStudent(Student student, int rollno) {
        for(Student s: std) {
            if(s.getRollNo() == rollno) {
                std.remove(s);
                std.add(student);
                break;
            }
        }
    }


}
