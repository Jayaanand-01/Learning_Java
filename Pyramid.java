/*
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args)
    {
        System.out.println("Enter the number: ");
        Scanner input=new Scanner(System.in);
        int numrows= input.nextInt();
        for(int i=0;i<numrows;i++)
        {
            for(int j=0;j<numrows-i;j++)
            {
                System.out.print("");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(k+ "");
            }
            for(int l=i-1;l>=i;l--)
            {
                System.out.print(l+ "");
            }
            System.out.println();
        }
        input.close();
    }
}

import java.util.Scanner;
public class Pyramid {
        public static void main(String[] args)
        {
            System.out.println("Enter the number that the pyramid should have:");
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            int i;
            for(i=n;i>=1;i--)
            {
                for(int j=1;j<=2*i-1;j++)
                {
                    System.out.print(i);
                }
                System.out.print("\n");
            }
        }
    }
    //Hollow Square pattern
    import java.util.Scanner;
    public class Pyramid {
    public static void main(String[] args)
    {
        System.out.println("Enter the number that the pyramid should have:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number that the pyramid should have:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i;
        for (i = 0; i <= n; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                System.out.print("*"+"\n ");
            }
        }
    }
}
public class Pyramid {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the number of rows

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces before asterisks
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing asterisks
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}*///inverted pyramis printing
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args)
    {
        int rows=5;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<rows;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

