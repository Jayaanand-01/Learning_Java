// Define a class named "Person"
public class Person {
    // Instance variables (attributes)
    private String name;
    private int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Define a subclass "Student" that extends "Person"
class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age); // Call the constructor of the superclass
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Override the displayInfo method to include student information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass
        System.out.println("Student ID: " + studentId);
    }
}

 class OopConceptsExample {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30);
        person.displayInfo();

        System.out.println();

        // Create a Student object
        Student student = new Student("Bob", 20, "S12345");
        student.displayInfo();
    }
}

