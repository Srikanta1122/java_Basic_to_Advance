import java.util.Scanner;
class P
{
    int a[][]=new int[3][3];
    int b[][]=new int[3][2];
    int c[][]=new int[3][2];
    int i,j,k,sum;
    void fun()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st array element : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd array element : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 1st array is : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("The 2nd array is : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The maltiplication of the matrtix is : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<2;j++)
            {
                sum=0;
                for(k=0;k<3;k++)
                {
                    sum=sum+a[i][k]*b[k][j];
                    c[i][j]=sum;
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class Multi {
    public static void main(String[] args) {
      P obj=new P();
      obj.fun();  
    }
    
}
