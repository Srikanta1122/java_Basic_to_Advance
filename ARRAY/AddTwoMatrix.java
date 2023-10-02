
import java.util.Scanner;

class P 
{
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int c[][] = new int[2][2];
    int i, j;

    void fun() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st array element:");
        for (i = 0; i < 2; i++) 
        {
            for (j = 0; j < 2; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd array element:");
        for (i = 0; i < 2; i++) 
        {
            for (j = 0; j < 2; j++) 
            {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 1st matrix is :");
        for (i = 0; i < 2; i++) 
        {
            for (j = 0; j < 2; j++) 
            {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("The 2nd matrix is :");
        for (i = 0; i < 2; i++) 
        {
            for (j = 0; j < 2; j++) 
            {
                System.out.print(b[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("The Addition of Matrix is :");
        for (i = 0; i < 2; i++) 
        {
            for (j = 0; j < 2; j++) 
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
                System.out.println();
        }
    }
}

public class AddTwoMatrix 
{
    public static void main(String[] args) 
    {
        P obj = new P();
        obj.fun();
    }
}
