import java.util.Scanner;

class Check
{
    int arr[]=new int[5];
    int sum=0;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(" "+arr[i]);
        }
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(" The sum of the array is: "+sum);
        
    }

}
public class Add_array {
    public static void main(String[] args) {
     Check r=new Check();
     r.function();   
    }
    
}
