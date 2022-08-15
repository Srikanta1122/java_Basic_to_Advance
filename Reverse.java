import java.util.Scanner;

class Check
{
    int n,r;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        while(n>0)
        {
        r=n%10;
        System.out.print(r);
        
        n=n/10;
        }
    }
}
public class Reverse 
{
    public static void main(String[] args) 
    {
    Check r=new Check();
    r.function();
    }
    
}
