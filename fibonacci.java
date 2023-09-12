/*
public class fibonacci {
    public static void main(String[] gs)
    {
        int n1=0,n2=1,n3,count=10;
        System.out.println(n1+"\n"+n2);
        for(int i=2;i<count;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}
 */
//Using recursion
public class fibonacci {
    static int n1=0,n2=1,n3=0;
    public static void printfibo(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printfibo(count - 1);
        }
    }
        public static void main(String[] args)
        {
            int count=10;
            System.out.println(n1+"\n"+n2);
            printfibo(count-2);

        }
    }
