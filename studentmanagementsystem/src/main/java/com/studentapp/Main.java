package com.studentapp;

public class Main {

    public static void main(String[] args) {
        System.out.println("****************** Student Management System ******************");
        System.out.println("****************** Welcome ******************");

        Student s1;
        s1 = new Student("Michael", 22, "S-21");
        s1.enrollCourse("Java");
        s1.enrollCourse("DevOps");
        s1.enrollCourse("DSA");
        s1.enrollCourse("C#");

        s1.printStudentInfo();
        // System.out.println(s1);

        Student s2 = new Student("Vu", 33, "S-22");
        s2.enrollCourse("Java");
        // System.out.println(s2);
        s2.printStudentInfo();

        Student s3 = new Student("Nguyen", 26, "S-23");
        s3.enrollCourse("DevOps");
        // System.out.println(s3);
        s3.printStudentInfo();
    }

}