
import java.util.Scanner;

class Check
{
    int arr[]=new int[5];
    int min;
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
        min=arr[0];
        for(int i=1;i<5;i++)
        {
                 if(arr[i]<min)
                 min=arr[i];
        }
        System.out.println(" The min is :"+min);
    }

}

public class MIN {
    public static void main(String[] args) {
     Check r=new Check();
     r.function();   
    }
    
}
