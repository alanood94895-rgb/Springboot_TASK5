package com.example.Springboot;

public class StudentController {
    public static void main(String[] args) {

        Student student = new Student(101, "Ahmed", "A");
        Student student1 = new Student(102, "Sara", "B");

        System.out.println("Original Student Details");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grade: " + student.getGrade());

        student.setStudentName("Ali");
        student1.setGrade("A");

        System.out.println("\n=== Updated Student Details ===");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grade: " + student.getGrade());

        System.out.println("\n=== Updated Student1 Details ===");
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Student Name: " + student1.getStudentName());
        System.out.println("Grade: " + student1.getGrade());
    }
}

