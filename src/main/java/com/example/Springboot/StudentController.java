package com.example.Springboot;

public class StudentController {
    public static void main(String[] args) {

        Student student = new Student(101, "Ahmed", "A");

        System.out.println("Original Student Details");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grade: " + student.getGrade());

    }
}

