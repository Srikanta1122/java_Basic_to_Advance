import java.util.Scanner;

class Check
{
    String r1;
    String temp;
    // String r2=" ";
    int l;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        r1=sc.nextLine();
        temp=r1;
        l=r1.length();
        // for(int i=l-1;i>=0;i--)
        // r2=r2+r1.charAt(i);
        // System.out.println(" "+r2);

    }
}
public class Palindrome_char {
    public static void main(String[] args) {
       Check r=new Check();
       r.function(); 
    }
    
}
