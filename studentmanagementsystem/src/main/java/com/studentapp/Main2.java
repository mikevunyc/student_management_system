package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    private static List<Student> studentList;

    public static void main(String[] args) {
        System.out.println("****************** Student Management System ******************");
        System.out.println("*************************** Welcome ***************************");

        studentList = new ArrayList<Student>();

        Student s1;
        s1 = new Student("Michael", 22, "S-21");
        s1.enrollCourse("Java");
        s1.enrollCourse("DevOps");
        s1.enrollCourse("DSA");
        s1.enrollCourse("C#");

        Student s2 = new Student("Vu", 33, "S-22");
        s2.enrollCourse("Java");

        Student s3 = new Student("Nguyen", 26, "S-23");
        s3.enrollCourse("DevOps");

        Student s4 = new Student("Amy", 23, "S-24");
        s3.enrollCourse("DevOps");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Student result = findStudentById("S-23");
        System.out.println("Result: " + result);
        sortByName();

    }

    private static void sortByName() {
        Comparator<Student> studentNameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        /*
            @Override
            public int compare(Student o1, Student o2){
                return o1.getName().compareTo(o2.getName());
            }
        */
        Collections.sort(studentList, studentNameComparator);
        System.out.println(studentList);
    }

    public static Student findStudentById(String studentId) {
        Student result = null;
        try {
            result = studentList
                    .stream()
                    .filter(x -> x.getStudentId().equalsIgnoreCase(studentId)).findFirst()
                    .orElseThrow(() -> new RuntimeException("No Data Found!!"));
        } catch (RuntimeException e) {
            System.out.println("Student with ID " + studentId + " not found!!");
        }
        return result;

    }

}