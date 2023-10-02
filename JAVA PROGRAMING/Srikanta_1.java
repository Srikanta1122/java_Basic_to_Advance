
                                   /* Interface Variables */
import java.util.Scanner;

interface client {
    int code=5;     // public+ststic+final
    void input();   // static + abstrsct

    void output();
}

class Srikanta_1 implements client {
    String name;
    int age;
    @Override
    public void input() {
        try (Scanner r = new Scanner(System.in)) {
            System.out.println("Enter the name:");
            name = r.nextLine();

            System.out.println("Enter the age");
            age = r.nextInt();
            // code=10;  Final
            System.out.println("client need "+code+" Program");
            
        }
    }

    public void output() {
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        client c = new Srikanta();
        c.input();
        c.output();
        System.out.println(client.code);
    }
}

