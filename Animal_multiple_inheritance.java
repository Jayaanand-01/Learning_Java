//public class multiple_inheritance {
   public class Animal_multiple_inheritance
{
        void eat()
        {
            System.out.println("eating...");
        }
    }
    class Dod extends Animal_multiple_inheritance
    {
        void bark()
        {
            System.out.println("barking...");
        }
    }
    class BabyDog extends Dod
    {
        void weep(){System.out.println("weeping...");}
    }
    class TestInheritance2{
        public static void main(String args[]){
            BabyDog d=new BabyDog();
            d.weep();
            d.bark();
            d.eat();
        }
}

