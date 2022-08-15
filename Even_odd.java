import java.util.Scanner;

class Check {
    int n;

    void function() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            n = sc.nextInt();
        }
        if (n % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}

public class Even_odd {
    public static void main(String[] args) {
        Check r = new Check();
        r.function();

    }

}
