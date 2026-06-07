package com.example.Springboot;

public class Student {

    private Integer StudentId;
    private String StudentName;
    private String Grade;

    public Student(int StudentId, String StudentName, String Grade) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.Grade = Grade;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        this.StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        this.Grade = grade;
    }
}