import java.util.*;
class AA{
    void fun()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        System.out.println("Enter the matrix ele : ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
         System.out.println();

        }
    }
}
public class Matrix{
    public static void main(String[] args) {
        AA obj=new AA();
        obj.fun();
    }
}
