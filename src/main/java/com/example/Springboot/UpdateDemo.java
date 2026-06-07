package com.example.Springboot;

public class UpdateDemo {
    public static void main (String[] args){
        String currentStudentName = "Ahamed";
        String newStudentName = "Ali";
        String updateStatus;

        System.out.println("Original Student Name: " + currentStudentName);
        System.out.println("Original Student Name: " + newStudentName);


        if (!currentStudentName.equals(newStudentName)) {

            currentStudentName = newStudentName;
            updateStatus = "Successful";

            System.out.println("Student name was updated successfully.");

        } else {
            updateStatus = "No Change Required";

            System.out.println("No update performed " +
                    "The existing value already matches the new value");
        }
        System.out.println("Final Student Name: " + currentStudentName);

        System.out.println("Update Status: " + updateStatus);



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


