import java.util.Scanner;

class Array
{
    int a[]=new int[5];
    int b[]=new int[5];
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("1st Array element are :");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("2st Array element are :");
        for(int i=0;i<b.length;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
    }
}
public class One_to_another {
    public static void main(String[] args) {
        Array r=new Array();
        r.function();      
    }
    
}

