import java.util.Scanner;

/*
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:\n");
        int n= input.nextInt();
        int i,m=0,flag=0;
        //int n=3;
        m=n/2;

        if(n==0||n==1)
        System.out.println(n+ " is not prime number");
        else
        {
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(n+ " is prime number");
            }
        }
    }
}

//Using method
import java.util.Scanner;
public class primeNumber {
    static void checkPrime(int n) {

        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1)
            System.out.println(n + " is not prime number");
        else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
                if (flag == 0) {
                    System.out.println(n + "is a prime number.");
                }
            }
        }
    }
        public static void main(String[] args)
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the number:");
                 int n = input.nextInt();
                checkPrime(3);
            }
        }
*/
class primeNumber{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
                count++;
        }
        if(count==0)
            System.out.println("Prime Number");
        else
            System.out.println("Composite Number");
    }
}
