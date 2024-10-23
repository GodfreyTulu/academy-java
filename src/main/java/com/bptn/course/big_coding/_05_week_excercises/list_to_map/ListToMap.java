package com.bptn.course.big_coding._05_week_excercises.list_to_map;

// Import all necessary packages here

import java.util.List;             // Use List data structure library
import java.util.ArrayList;        // Use ArrayList implementation of List
import java.util.Map;              // Use Map for key-value pairs 
import java.util.stream.Collectors; // Use Java Streams and Collectors for data manipulation


public class ListToMap {

    // Create a static method called "convertStudentListToMap" that converts a list of students to a map

    public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {

        // Convert the list of students to a map using Java Streams and Collectors.toMap()
        // The student ID will be the key, and the Student object itself will be the value

        return students.stream()
                       .collect(Collectors.toMap(Student::getId, student -> student));
    }

    // Complete the main method
    public static void main(String[] args) {

        // Create a list of students
        List<Student> students = new ArrayList<>();
        
        //add student objects to this list
        students.add(new Student(1, "Alice", 20));
        students.add(new Student(2, "Bob", 22));
        students.add(new Student(3, "Charlie", 21));

        // Call "convertStudentListToMap" method and hold the returned value in "studentMap" variable.
        Map<Integer, Student> studentMap = convertStudentListToMap(students);
       
        // Print the map
        System.out.println("Students Map: "+ studentMap);
    }
}
