import java.util.*;

class A{
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];

    void fun()
    {
        System.out.println("Enter the array element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        // print the element 
        System.out.print("The array element are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        // Search the element in the array 
        System.out.println();
        System.out.println("Enter the searching ele in the array : ");
        int x=sc.nextInt();
        // for(int i=0;i<arr.length;i++)
        // {
        //     if (arr[i]==x) {
        //         System.out.println("Ele found at index : "+i +" "+ "And the ele is : "+arr[i]);
        //         break;
        //     }
        // }
    

    }
}
public class Array_1{
    public static void main(String args[]){
        A obj=new A();
        obj.fun();
    }
}
