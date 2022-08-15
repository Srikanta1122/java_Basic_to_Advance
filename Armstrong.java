import java.util.Scanner;

class Check 
{
    int n, r, c, sum = 0,temp;

    void function() 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        temp=n;
        while (n > 0) 
        {
            r = n % 10;
            c = r * r * r;
            sum = sum + c;
            n = n / 10;
        }
       
        if (temp == sum)
        {
            System.out.println("Amstrong number");
        }
        else
            System.out.println("Not a Amstrong number");
    }
}

public class Armstrong {
    public static void main(String[] args) {
        Check r = new Check();
        r.function();
    }

}
