import java.util.Scanner;
class P
{
    int a[][]=new int[2][3];
    int i,j;
    void fun()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}
public class Matrix
{
    public static void main(String[] args) {
        P obj=new P();
        obj.fun();
    }
}
