import java.util.Scanner;

class Check{
    int n;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        if(n>0)
        System.out.println("Number is '+'");
        else if(n<0)
        System.out.println("Number is '-'");
        else
        System.out.println("INVALID NUMBER");
    }
}
public class Positive_negetive
{
    public static void main(String[] args) 
    {
        Check r=new Check();
        r.function();       
    }
}

