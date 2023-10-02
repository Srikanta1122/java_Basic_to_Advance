                               /* Interface introduction */
import java.util.Scanner;

interface client {
    void input();

    void output();
}

class Srikanta implements client {
    String name;
    int age;

    public void input() {
        try (Scanner r = new Scanner(System.in)) {
            System.out.println("Enter the name:");
            name = r.nextLine();

            System.out.println("Enter the age");
            age = r.nextInt();
        }
    }

    public void output() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        client c = new Srikanta();
        c.input();
        c.output();
    }
}
