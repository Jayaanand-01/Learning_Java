public class Parameterized_constructor {
    String name;
    int id;
    //constructor
    Parameterized_constructor(String my_name,int rollno) {
        this.name=my_name;
        this.id=rollno;
    }
    public static void main(String[] args) {
        Parameterized_constructor obj1 = new Parameterized_constructor("Alex",2);
        Parameterized_constructor obj2 = new Parameterized_constructor("Alex", 3);
        System.out.println("Student name:"+ obj1.name);
        System.out.println("Rollno:"+obj1.id);
        System.out.println("Student name:"+obj2.name);
        System.out.println("Rollno:"+obj2.id);
    }
}
