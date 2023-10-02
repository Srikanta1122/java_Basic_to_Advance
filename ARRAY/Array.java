import java.util.Scanner;

class Check
{
    int arr[]=new int[5];
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the array element :");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(" The array element are "+ arr[i]);
        }
    }    
}
public class Array 
{
    public static void main(String[] args) 
    {
     Check c=new Check();
     c.function();   
    }
    
}
