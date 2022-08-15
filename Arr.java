import java.util.Scanner;

class A
{
    int a[]=new int[5];
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element:");
        for(int i=0;i<5;i++)
        {
         a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("The array element are :" + a[i]);
        }

    }
}

public class Arr {
    public static void main(String[] args) {
      A obj=new A();
      obj.function();  
    }
    
}
