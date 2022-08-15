import java.util.Scanner;
class Check
{
    int n;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n:");
        n=sc.nextInt();
       if(n>=18)
       System.out.println("You are eligible for vote");
       else
       System.out.println("You are not eligible for vote");
    }
}
public class Voting_eligibility {
    public static void main(String[] args) {
    Check r=new Check();    
    r.function();
    }
    
}
