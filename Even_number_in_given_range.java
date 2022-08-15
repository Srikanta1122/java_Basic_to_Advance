import java.util.Scanner;

class Even
{
    int n;
    void function()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            n=sc.nextInt();
        }
        for(int i=0;i<=n;i=i+2)
        System.out.println(" "+i);
    }
}

public class Even_number_in_given_range {
    public static void main(String[] args) {
        Even r=new Even();
        r.function();      
    }
}
