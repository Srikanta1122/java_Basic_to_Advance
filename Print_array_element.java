import java.util.Scanner;

class Array
{
    int a[]=new int[5];
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
public class Print_array_element{
    public static void main(String[] args) {
  Array r=new Array();
  r.function();  
    }
}
