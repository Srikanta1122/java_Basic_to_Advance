import java.util.*;

class A{
    // User define array 
    int arr[]=new int[5];
    void fun()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("The array ele is : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        // print the element 
        System.out.print("The element are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
public class Array{
    public static void main(String args[]){
        A obj=new A();
        obj.fun();
    }
}