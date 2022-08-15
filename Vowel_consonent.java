import java.util.Scanner;

class Check
{
    char n;
    void function()
    {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the Char:");
           n=sc.next().charAt(0);
    }
       if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
        {
            System.out.println("Given number is vowel");
        }
        else
        {
            System.out.println("Given number is consonent");
        }
    }
}
public class Vowel_consonent {
    public static void main(String[] args) {
     Check r=new Check();
     r.function();   
    }
    
}
