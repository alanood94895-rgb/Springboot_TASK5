package com.example.Springboot;

public class Student {

    private Integer StudentId;
    private String StudentName;
    private String Grade;

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public Student (Integer StudentId, String StudentName, String Grade){
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.Grade = Grade;

    }
}
