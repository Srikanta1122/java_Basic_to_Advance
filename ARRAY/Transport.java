/* 
 1 2 3
 4 5 6  (2*3) the transport matrix is : 1 4
                                        2 5 
                                        3 6  (3*2)   */

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
        System.out.println("The transport matrix is :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[j][i]+" ");
                
            }
            System.out.println();
        }
    }
}
public class Transport
{
    public static void main(String[] args) {
        P obj=new P();
        obj.fun();
    }
}
