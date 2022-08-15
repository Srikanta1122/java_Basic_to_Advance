import java.util.Scanner;

class Check
{
    int n,r,sum=0;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        while(n>0)
        {
        r=n%10;
        sum=sum+r;   
        n=n/10;
        }
        System.out.print(sum);
    }
}

public class Sum_of_digit {
public static void main(String[] args) {
    Check r=new Check();
    r.function();    
}    
}
