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
        switch(ch)
        {
            case 1: System.out.println("Addion is: "+(n1+n2));
            break;
    
            case 2: System.out.println("Subtraction is: "+(n1-n2));
            break;
        
            case 3: System.out.println("Multiplecation is: "+(n1*n2));
            break;
        
            case 4: System.out.println("Division is: "+(n1/n2));
            break;
        
            case 5: System.out.println("Modiulo is: "+(n1%n2));
            break;
            default: 
            System.err.println("INVALID NUMBER");
        }
    }
}
public class Calculator_2 {
    public static void main(String[] args) {
     Calculator r=new Calculator();
     r.function();   
    }
    
}
