/*
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String reverse="";
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the name:");
        String original=input.nextLine();
        int len=original.length();
        for(int i=len-1;i>=0;i--)
        {
            reverse+=original.charAt(i);
        }
        if(original.equals(reverse))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a  palindrome ");

    }
}

import java.util.Scanner;
public class Palindrome {
    public static boolean ispalindrome(int n)
    {
        int originalnum=n;
        int reverse=0;
        while(n>0)
        {
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return originalnum==reverse;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=input.nextInt();
        boolean res=ispalindrome(number);
        if(res)
            System.out.println(number+ " is a palindrome.");
        else
            System.out.println(number+ " is not a palindrome.");

    }
}
 */