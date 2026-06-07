package com.example.Springboot;

public class UpdateDemo {

    public static void main(String[] args) {

        String currentStudentName = "Ahmed";

        String newStudentName = "Ali";

        boolean isUpdated;

        System.out.println("Current Student Name: " + currentStudentName);
        System.out.println("New Student Name: " + newStudentName);

        if (!currentStudentName.equals(newStudentName)) {

            currentStudentName = newStudentName;
            isUpdated = true;

            System.out.println("Student name updated successfully.");

        } else {

            isUpdated = false;

            System.out.println("No update required. Student name is already current.");
        }

        System.out.println("Final Student Name: " + currentStudentName);

        System.out.println("Update Status: " + isUpdated);
    }
}