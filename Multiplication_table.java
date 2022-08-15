import java.util.Scanner;

class Mul {
    int n, i;

    void multi() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            n = sc.nextInt();
        }
        for (i = 1; i <= 10; i++)
            System.out.println(n +" x "+ i +" = "+ (n * i));
    }
}

public class Multiplication_table {
    public static void main(String[] args) {
        Mul r = new Mul();
        r.multi();
    }

}
