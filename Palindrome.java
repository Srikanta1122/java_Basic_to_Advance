import java.util.Scanner;

class Check
{
    int arr[]=new int[5];
    int n,r,sum=0,temp;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        for(int i=0;i<=5;i++)
        {
        arr[i]=sc.nextInt();
        }
        temp=arr[i];
        while(n>0)
        {
        r=n%10;
        sum=sum*10+r;
        n=n/10;                      
        }
        if(temp==sum)
        {
            System.out.println("Palindrome number");
        }
        else
            System.out.println("Not a Palindrome number");
}
}

public class Palindrome {
public static void main(String[] args) {
    Check r=new Check();
    r.function();    
}    
}
