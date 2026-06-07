package com.example.Springboot;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
private Student student = new Student(101, "Ahmed", "A");

    @PutMapping("/update-student")
    public String updateStudentName(
            @RequestParam String name) {

        String previousName =
                student.getStudentName();

        student.setStudentName(name);

        return "Student name updated successfully.\n"
                + "Previous Name: " + previousName + "\n"
                + "New Name: " + student.getStudentName();
    }
}
