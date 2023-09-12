import java.util.Scanner;
//static is used to access the values based on their class names>>
public class static_keyword {
    static String Subject;
    static void myMethod()
    {
        System.out.println("WELCOME TO "+Subject);
    }
    public static void main(String[] args) {
        static_keyword.Subject="Java-web development";
        static_keyword.myMethod();
    }
}
