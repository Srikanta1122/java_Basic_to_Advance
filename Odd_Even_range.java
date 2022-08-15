import java.util.Scanner;

class Odd_Even
 {
    int n1;

    void function() 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            n1 = sc.nextInt();
        }
        if (n1 % 2 == 0)
         {
            System.out.println("FOR EVEN");
            for (int i = 0; i <= n1; i = i + 2)

                System.out.println(" " + i);
         }
        else if(n1 % 2 != 0)
        
        System.out.println("FOR ODD");
            for (int i = 1; i <= n1; i = i + 2)
                System.out.println(" " + i);
    
}
}

public class Odd_Even_range 
{
    public static void main(String[] args) 
    {
        Odd_Even r = new Odd_Even();
        r.function();
    }

}
