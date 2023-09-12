/*
import java.util.*;
public class Triangle {
    public static void Startriangle(int n)
    {
        int a,b;
        for(a=0;a<n;a++)
        {
            for(b=0;b<=a;b++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int k=5;
        Startriangle(k);

    }
}
 */
import java.util.*;
 class rtri{
    public static void printrow(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print("* ");
        printrow(n-1);
    }
    public static void changerow(int n)
    {
        if(n==0)
        {
            return;
        }
        changerow(n-1);
        printrow(n);
        System.out.println("\n");
    }
    public static void main(String[] args) {
        rtri.printrow(10);

    }
}