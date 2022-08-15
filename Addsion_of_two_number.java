import java.util.Scanner;

class Addision 
{
    int a, b, c;

    void add() 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the of a and b:");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        c = a + b;
        System.out.println("sum of the number is: " +c);
    }
}

class Addsion_of_two_number 
{
    public static void main(String[] args) 
    {
        Addision r = new Addision();
        r.add();
    }
}
