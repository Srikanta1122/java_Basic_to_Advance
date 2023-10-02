import java.util.Scanner;

class Check
{
    int arr[][]=new int[3][3];
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(" The matrix is :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.print("\n");
        }
        
    }
}
public class Print_matrix {
    public static void main(String[] args) {
      Check r=new Check();
      r.function();  
    }
    
}
