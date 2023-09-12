import java.util.*;
public class rectangle {
    static int l;
    static int b;
//    Rectangle(int len,int brea)
//    {
//        this.l=len;
//        this.b=brea;
//    }
    public static int area()
    {
        int area=l*b;
        return area;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Length:");
        l=input.nextInt();
        System.out.println("Breadth:");
        b=input.nextInt();
//        Rectangle obj=new Rectangle();
        System.out.println("Area:"+area());
    }
}
