import java.util.Scanner;

class Check
{
    int n;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();

        switch(n)
        {
            case 1 : System.out.println("SUNDAY");
            break;
            case 2 : System.out.println("MONDAY");
            break;
            case 3 : System.out.println("THUESDAY");
            break;
            case 4 : System.out.println("WENESDAY");
            break;
            case 5 : System.out.println("THURSDAY");
            break;
            case 6 : System.out.println("FIRDAY");
            break;
            case 7 : System.out.println("SUTUREDAY");
            break;

            default :
            System.out.println("UNVALID NUMBER");
        }
    }
}

public class Switch 
{
    public static void main(String[] args) 
    {
        Check c=new Check();
        c.function();
    }
    
}
