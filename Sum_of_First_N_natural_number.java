import java.util.Scanner;

class Check {
    int n, sum = 0;

    void function() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        System.out.print(" " + sum);
    }

}

public class Sum_of_First_N_natural_number {
    public static void main(String[] args) {
        Check r = new Check();
        r.function();
    }
}
