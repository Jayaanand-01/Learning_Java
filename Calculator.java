/*import java.util.Scanner;
public class Oop_basic {
    String name;
    int age;
    String address;
}
public Oop_basic(String name,int age,String address)
{
    this.name=name;
    this.age=age;
    this.address=address;
}
    public void setName()
    {
    this.name=name;
    }
    public void setAge()
    {
        this.age=age;
    }
    public void setAddress()
    {
        this.address=address;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAddress()
    {
        return address;
    }
public static void main(String[] args)
{
    return 0;
}

import java.util.Scanner;

public class Oop_basic {
    // Fields
    private String name;
    private int age;
    private String address;

    // Constructor
    public Oop_basic(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        // Create an instance of Oop_basic
        Oop_basic person = new Oop_basic("John", 30, "123 Main St");

        // Access and print the values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());

        // Update values using setter methods
        person.setName("Alice");
        person.setAge(25);
        person.setAddress("456 Elm St");

        // Access and print updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Updated Address: " + person.getAddress());
    }
}

class Animal
{
    void eat()
    {
        System.out.println("I am a omnivorous!! ");
    }
}

class Mammal extends Animal
{
    void nature()
    {
        System.out.println("I am a mammal!! ");
    }
}

class Dog extends Mammal
{
    void sound()
    {
        System.out.println("I bark!! ");
    }
}

class Inheritance
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.nature();
        d.eat();
        d.sound();
    }
}

import java.util.Scanner;
public class Oop_basic {
    static void myMethod()
    {
        System.out.println("It was just an example\n");

    }
    public static void main(String[] args)
    {
        myMethod();
        myMethod();
        myMethod();
    }
}

import java.util.Scanner;
public class Oop_basic {
        static void myMethod(String fname)
        {
            System.out.println(fname+" read");
    }
    public static void main(String[] args)
    {
        myMethod("Jaya Anand");
    }
}
//Factorial recursion
public class Oop_basic {
    static int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args)
    {
        System.out.println("Factorial of 2 is: " +factorial(2));
    }
}


//Reverse the string

import java.util.Scanner;
public class Oop_basic {
    public static String reverseString(String name) {
        char[] ch = name.toCharArray();
        String rev = ""; // Initialize with an empty string, not a space
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String name = input.nextLine();
        input.close(); // Close the Scanner when done with it
        String reversedString = reverseString(name);
        System.out.println("Reversed string: " + reversedString);
    }
}
 */

 class Calculator {
    public static int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}
     class demo
    {
        public static void main(String[] args)
        {
            int num1=4;
            int num2=5;
            //Calculator calc=new Calculator();
            //int result=calc.add(num1,num2);
            System.out.println(Calculator.add(num1,num2));
        }
    }
