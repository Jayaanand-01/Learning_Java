import java.util.*;
public class construtor {
    String name;
    int id;
    construtor()
    {
        System.out.println("Initializing values:");
        name="Jaya Anand";
        id=-1;
    }
    public static void main(String[] args) {
        construtor input=new construtor();
        System.out.println("Name:"+input.name);
        System.out.println("id:"+input.id);
    }
}
