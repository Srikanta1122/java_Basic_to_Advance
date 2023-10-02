import java.util.*;
class AA{
    
    void fun()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int size=sc.nextInt();
    int arr[]=new int[size];
        System.out.println("Enter the array ele : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("The array ele are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The max ele of the array is : ");
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print(max+" ");
        System.out.println();
        System.out.print("The min ele of the array is : ");
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.print(min+" ");
        System.out.println("Find the array ele ---> ");
        System.out.println("Enter the value of x : ");
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x){
                System.out.println("Ele found at index "+i+" And the ele is : "+arr[i]);
                break;
            }
        }
        System.out.println("Accending order is : ");
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("Decending order is : ");

        int temp1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp1=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp1;
                }
            }
        }
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("The reverse order of the array ele are : ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
public class Reverse{
    public static void main(String[] args) {
        AA obj=new AA();
        obj.fun();
    }
}
