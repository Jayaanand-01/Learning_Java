/*
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i,fact=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= input.nextInt();
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
import java.util.Scanner;
public class Factorial {
    public static int isFact(int n) {
        if(n==0)
            return 1;
        else
            return(n*isFact(n-1));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=input.nextInt();
        int result=isFact(number);
        System.out.println(result);
    }
    }
*/