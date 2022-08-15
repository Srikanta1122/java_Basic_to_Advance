import java.util.Scanner;
class Check
{
    int n1,n2,temp;             // With using the 3rd variable
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n1 and n2 : ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Before swaping n1 and n2 is: "+n1+" "+n2);
        // temp=n1;
        // n1=n2;
        // n2=temp;
        n2=n2-n1;
        n1=n1+n2;
        System.out.println("After swaping n1 and n2 is: "+n1+" "+n2);

     
    }
}
public class Swap_two_number {
    public static void main(String[] args) {
    Check r=new Check();
    r.function();    
    }
    
}
