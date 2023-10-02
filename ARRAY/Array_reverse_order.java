import java.util.Scanner;

class Array
{
    int a[]=new int[5];
    void function()
    {
        System.out.println("Length of the array is :"+a.length);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element:");
        for(int i=0;i<a.length;i++)
        {
        a[i]=sc.nextInt();
        }
        System.out.println("Array element are:");
        for(int i=0;i<a.length;i++)
        {
        System.out.print(a[i]+" ");
        }

        System.out.print("Reverse order is:");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}
public class Array_reverse_order {
    public static void main(String[] args) {
     Array r=new Array();
     r.function();   
    }
    
}
