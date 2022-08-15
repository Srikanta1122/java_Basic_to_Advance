import java.util.Scanner;

class Calculator
{
    int n1,n2,ch;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number:");
        n1 = sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Select number:");
        ch=sc.nextInt();
        if(ch==1)
                System.out.println("Addition "+(n1+n2));
          
        else if(ch==2) 
        System.out.println("Subtraction "+(n1-n2));
        else if(ch==3) 
        System.out.println("Multiplecation "+(n1*n2));
        else if(ch==4) 
        System.out.println("Division "+(n1/n2));
        else if(ch==5) 
        System.out.println("Modiulo "+(n1%n2));
        else
        System.out.println("INVALID NUMBER");


    }
}

public class Calculator_1 {
    public static void main(String[] args) {
     Calculator r=new Calculator();
     r.function();   
    }
    
}
