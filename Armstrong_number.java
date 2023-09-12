
/*
import java.util.Scanner;

import java.lang.Math;

public class Armstrong_number {
    public static boolean isArmstrong(int n)
    {
        int originalNumber,rem,flag=0;
        originalNumber=n;
        int count=countDigits(n);
        while(originalNumber>0)
        {
            rem=originalNumber%10;
            flag+=Math.pow(rem,num);
            originalNumber=originalNumber/10;

        }
        return originalNumber==flag;
    }

    public static int countDigits(int num)
    {
        int count=0;
        while(num!=0)
        {
            int num=num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= input.nextInt();
        isArmstrong(number);
        if(isArmstrong(number))
        {
            System.out.println("It is armstrong number");
        }
        else
        System.out.println( "It is not a armstrong number");
        //System.out.println("");
    }
}

 */
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber, remainder, result = 0;
        originalNumber = num;

        // Calculate the number of digits in the number
        int n = countDigits(num);

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return num == result;
    }

    // Function to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
            System.out.println(count);
        }
        return count;
    }
}

