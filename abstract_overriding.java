import java.util.*;
abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}
class Cirle extends Shape
{
    double radius;

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}
class Rectangl extends Shape{
    double len;
    double bre;

    @Override
    public double perimeter() {
        return 2*(len+bre);
    }

    @Override
    public double area() {
        return (len*bre);
    }
}
public class abstract_overriding
{
    public static void main(String[] args) {


        //Cirle c=new Cirle();
        Rectangl r=new Rectangl();
        //c.radius=3;
        r.len=10;
        r.bre=5;
       // Shape s=r;
        // Shape s=c;
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}
