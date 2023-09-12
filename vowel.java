import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence= input.nextLine();
        boolean isLower,isUpper;
        int vowelcount=0;
        for(int i =0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            isLower=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
            isUpper=(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
            if(isLower||isUpper)
            {
                vowelcount++;
            }
        }
        System.out.println("Number of vowel:"+vowelcount);
    }
}
