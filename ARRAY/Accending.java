import java.util.Scanner;

class Check
{
    int arr[]=new int[5];
    int temp;
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
            for(int j=i+1;j<5;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
        System.out.print(" The accending order is : ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
       
    }

}
public class Accending {
    public static void main(String[] args) {
     Check r=new Check();
     r.function();   
    }
    
}
