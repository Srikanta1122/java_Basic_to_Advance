import java.util.Scanner;

class Check
{
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first element:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(" Enter the second element : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println(" The Addition matrix is : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(" "+c[i][j]);
            }
            System.out.print("\n");

        }
        
    }
}

public class Addition_of_matrix {
    public static void main(String[] args) {
        Check r=new Check();
        r.function();     
    }
    
}
