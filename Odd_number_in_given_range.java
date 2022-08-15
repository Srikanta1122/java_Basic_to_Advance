import java.util.Scanner;

class Odd
{
    int n;
    void function()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            n=sc.nextInt();
        }
        for(int i=1;i<=n;i=i+2)
        System.out.println(" "+i);
    }
}
public class Odd_number_in_given_range {
    public static void main(String[] args) {
    Odd r=new Odd();
    r.function();    
    }
    
}
