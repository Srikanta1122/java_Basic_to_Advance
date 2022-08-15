import java.util.Scanner;

class Check 
{
    char n;

    void function() 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Char:");
            n = sc.next().charAt(0);
        }
        int a = n;
        System.out.println(a);

    }
}

public class ASCII 
{
    public static void main(String[] args) 
    {
        Check r = new Check();
        r.function();
    }

}
