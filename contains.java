
//import java.util.Scanner;
import java.util.*;
public class contains {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the text:");
        String text= input.nextLine();
        String check="Java";
        boolean res=text.contains(check);
        if(res)
        {
            System.out.println(check+" is present in the text.");
        }
        else
            System.out.println(check+" is not present in the text.");

    }
}
