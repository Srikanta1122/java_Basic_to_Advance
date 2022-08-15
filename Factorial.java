import java.util.Scanner;
class Check
{
    int n,fact=1;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        fact=fact*i;
        System.out.println("Factorial of the given number is :"+fact);

    }
}
public class Factorial {
    public static void main(String[] args) {
    Check r=new Check();
    r.function();    
    }
    
}
