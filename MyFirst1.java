class Lion {
    String name;
    public void eat() {
        System.out.println("Eating.........");
    }
}

    class tiger extends Lion {
    public void hunt()
    {
            System.out.println("I will be hunted" + name);
        }
    }

  class MyFirst1
    {
        public static void main(String[] args) {
            tiger dog = new tiger();
            dog.name = "Shelly";
            dog.eat();
            dog.hunt();
        }
    }
