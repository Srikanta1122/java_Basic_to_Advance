import java.util.Scanner;

class Check
{
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    int sum=0;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first matrix element:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(" Enter the second matrix element : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println(" The first matrix is : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println(" The second matrix is : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+b[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println(" Multiplecation of the matrix is : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum=0;
                for(int k=0;k<3;k++)
                {
                   sum=sum+a[i][k]*b[k][j];
                }
                c[i][j]=sum;
                System.out.print(" "+c[i][j]);
            }
            System.out.print("\n");

        }
        
    }
}

public class Matrix_multiplecation {
    public static void main(String[] args) {
        Check r = new Check();
        r.function(); 
    }
    
}
