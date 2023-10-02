import java.util.Scanner;

class Check
{
    int arr[]=new int[5];
    float avg;
    float sum=0;
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
        avg=sum/5;
        System.out.println(" The avg is: "+avg);
       
    }

}
public class Avg_of_element {
    public static void main(String[] args) {
     Check r=new Check();
     r.function();   
    }
    
}
