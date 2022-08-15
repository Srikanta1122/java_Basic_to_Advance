import java.util.Scanner;

class Check
{
    int a,b;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of a:");
        a=sc.nextInt();
        System.out.println("Enter the number of b:");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greatest");
        }
        else
        System.out.println("b is greatest");
    }
}
public class Greatest_number {
    public static void main(String[] args) {
     Check r=new Check();
     r.function();   
    }
    
}
