public class obj_calling_sample {

    String languages="JAVA";//field
        void java()//method
        {
            System.out.println("Java is a best programming language");
        }
      public static void main(String[] args)
      {
          obj_calling_sample lang=new obj_calling_sample();//creating a new object
          System.out.println("Languages used is:"+lang.languages);
          lang.java();
      }

    }

