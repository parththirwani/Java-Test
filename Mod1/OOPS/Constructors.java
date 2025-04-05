package Mod1.OOPS;

class Student {
    String name;
    int age;

    // 1. Default Constructor
    Student() {
        System.out.println("Default constructor called!");
        name = "Unknown";
        age = 0;
    }

    // 2. Parameterized Constructor
    Student(String name, int age) {
        this.name = name;  // 'this' refers to the current object
        this.age = age;
    }

    // Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructors {
    public static void main(String[] args) {

        // Using default constructor
        Student s1 = new Student();
        s1.displayInfo();

        System.out.println("---------------------");

        // Using parameterized constructor
        Student s2 = new Student("Parth", 21);
        s2.displayInfo();
    }
}
