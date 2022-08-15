import java.util.Scanner;

class Check
{
    int n;
    void function()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            n=sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        System.out.print(" "+i);
    }

}

public class First_n_natural_number {
    public static void main(String[] args) {
    Check r=new Check();
    r.function();   
    }
}
