/*
//Swapping of three numbers
import java.util.Scanner;

public class basic_Programs{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Swap the numbers
        int temp;
        temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);

        scanner.close();
    }
}
//Vote program(Age)
import java.util.Scanner;
public class basic_Programs{
    public static void main(String[] args)
    {
        System.out.print("Enter your age: ");

        Scanner input=new Scanner(System.in);
        int age= input.nextInt();

        if(age>=18)
            System.out.println("your are eligible to vote"+age);
        else
            System.out.println("Your are not eligible to vote "+age);
    }
}

import java.util.Scanner;
public class basic_Programs {
    public static void main(String[] ds)
    {
        System.out.println("Enter the number:");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();

        if(number%2==0)
            System.out.println(number + " is Even" );
        else
            System.out.println(number + " is Odd" );

    }
}

 import java.util.Scanner;
 public class basic_Programs {
     public static void main(String[] args)
     {
         int sum=0;
         System.out.println("Enter the number: ");
         Scanner input=new Scanner(System.in);
         int number= input.nextInt();
         for(int i=1;i<=number;i++)
         {
             sum=sum+i;
         }
         System.out.println("The sum of the number is: " + sum);
     }
}
//Sum of n numbers using n formula
import java.util.Scanner;
public class basic_Programs {

public static void main(String[] fs)
        {
            System.out.println("Enter the number: ");
            Scanner input=new Scanner(System.in);
            int number=input.nextInt();
            System.out.println("The Sum of n numbers is: " + (number*(number+1)/2));
            //System.out.println(number);
        }
    }
//Sum of n number with recursion function used

import java.util.Scanner;
public class basic_Programs {
    public static void main(String[] args)
    {
        System.out.println("Enter the number: " );
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        int sum= getSum(number);
        System.out.println(sum);
    }
    static int getSum(int number)
    {
        if(number==0)
            return 0;
        else
            return number+getSum(number-1);
    }
}
import java.util.Scanner;
public class basic_Programs {
    public static void main(String[] args)
    {
        //Scanner input=new Scanner(System.in);
        System.out.println("Enter the name:");
        //String name=input.nextLine();
        StringBuilder a=new StringBuilder("Jaya Anand");
        System.out.println(a);
        StringBuilder b=new StringBuilder();
        for(int i = a.length()-1; i>=0; --i)
        {
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
//reverse of a string using object
        import java.util.Scanner;
public class basic_Programs {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=input.nextLine();
        //StringBuilder a=new StringBuilder("Jaya Anand");
        //System.out.println(a);
        StringBuilder b=new StringBuilder();
        for(int i = name.length()-1; i>=0; --i)
        {
            b.append(name.charAt(i));
        }
        System.out.println(b);
    }
}

 */