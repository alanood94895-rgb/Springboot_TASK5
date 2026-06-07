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

            System.out.println("No update performed. " +
                    "The existing value already matches the new value.");
        }
        System.out.println("Final Student Name: " + currentStudentName);

        }



}
