import java.util.Scanner;

class Check
{
    int arr[]=new int[5];
    int sum=0;
    int n,count=0;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("  Enter the searching element : ");
        n=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(n==arr[i])
            {
                count++;
            }
        }
        if(count>0)
        System.out.println("Item found");
        else
        System.out.println("Item is not found");
        
    }

}
public class Search_element {
    public static void main(String[] args) {
     Check r=new Check();
     r.function();   
    }
    
}
