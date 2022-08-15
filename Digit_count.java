import java.util.Scanner;
class Check
{
    int n,count=0;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n:");
        n=sc.nextInt();
        while(n>0)
        {
        n=n/10;
        count++;
        }
        System.out.println("Number of the count is :"+count);

    }
}
public class Digit_count {
    public static void main(String[] args) {
     Check r=new Check();
     r.function();   
    }
    
}
