import java.util.Scanner;

class Check
{
    int arr[]=new int[5];
    int sum=0;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(" "+arr[i]);
            sum=arr[i]+sum;
        }
           System.out.println(" "+"The sum is :"+sum);
        
        
    }
}
public class Sum_array_element {
    public static void main(String[] args) {
    Check r=new Check();
    r.function();    
    }
    
}
