import java.util.Scanner;

class Check
{
    int a,b,c;
    void function()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of a:");
        a=sc.nextInt();
        System.out.println("Enter the number of b:");
        b=sc.nextInt();
        System.out.println("Enter the number of c:");
        c=sc.nextInt();
        if(a>b && a>c)
        
        System.out.println("a is the greatest number");
        else if(b>a && b>c)
        System.out.println("b is the greatest number");
    else 
    System.out.println("c is the greatest number"); 
    }
}
public class Greatest_of_three {
    public static void main(String[] args) {
    Check r=new Check();
    r.function();    
    }
    
}
