package com.bptn.course.big_coding._05_week_excercises.list_to_map;

public class Student {

    // Declare instance variables for the Student class: id (integer), name (string), and age (integer)
    private int id;        // Unique identifier for each student
    private String name;   // Name of the student
    private int age;       // Age of the student

    // Constructor to create a Student object
    // Takes three parameters: id, name, and age to initialize all instance variables
    public Student(int id, String name, int age) {
        this.id = id;      // Initialize the instance variable 'id' using the parameter id
        this.name = name;  // Initialize the instance variable 'name' using the parameter name
        this.age = age;    // Initialize the instance variable 'age' using the parameter age
    }
    
    // Getter method to retrieve the id of the student
    public int getId() {
        return id;         // Return the value of the instance variable 'id'
    }
    
    // Getter method to retrieve the name of the student
    public String getName() {
        return name;       // Return the value of the instance variable 'name'
    } 

    // Getter method to retrieve the age of the student
    public int getAge() {
        return age;        // Return the value of the instance variable 'age'
    }
    
    // Override the toString method to provide a string representation of the Student object
    @Override
    public String toString() {
        // Return a formatted string that includes the id, name, and age of the student
        return "Student{" +
                "id=" + id + 
                ", name='" + name + '\'' + 
                ", age=" + age + 
                '}'; 
    }
}
