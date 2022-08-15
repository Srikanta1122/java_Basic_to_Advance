class Check {

    void function() {
        char n;
        System.out.println("Upper order");
        for (n = 'A'; n <= 'Z'; n++)
            System.out.print(" " + n+" ");

    }

    void function_1() {
        char m;
        System.out.println(" "+"Lower order:");
        for (m = 'a'; m <= 'z'; m++)

            System.out.print(" " + m);

    }
}

public class A_Z {
    public static void main(String[] args) {
        Check r = new Check();
        r.function();
        r.function_1();
    }

}
