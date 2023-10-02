import java.util.Scanner;

class P 
{
    int a[][] = new int[2][2];
    int i, j, SumRow = 0, SumCol = 0;

    void fun() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element:");
        for (i = 0; i < 2; i++) 
        {
            for (j = 0; j < 2; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for (i = 0; i < 2; i++) 
        {
            for (j = 0; j < 2; j++) 
            {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("The sum of row and colum is :");
        for (i = 0; i < 2; i++) 
        {
            SumRow = SumCol = 0;
            for (j = 0; j < 2; j++) 
            {
                SumRow += a[i][j];
                SumCol += a[j][i];
            }
            System.out.println("SR = " + SumRow + " " + "SC = " + SumCol);
        }
    }
}

public class SRSC 
{
    public static void main(String[] args) 
    {
        P obj = new P();
        obj.fun();
    }
}
