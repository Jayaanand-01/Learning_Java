
import java.util.*;
import java.lang.*;
abstract class Super
{
    public Super()
    {
        System.out.println("helloo");
    }
    public void meth1()
    {
        System.out.println("Welcome");
    }
    abstract public void meth2();
}
class  Sub extends Super
        {
    public void meth2()
        {
            System.out.println("Again welcome");
        }
        }
public class abstract_eg
{
    public static void main(String[] args)
    {
        Super s=new Sub();
        s.meth1();
        s.meth2();
    }
}
