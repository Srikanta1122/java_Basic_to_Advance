class Employee {
    private int id, ed;
    private String name;

    public void set_1(int a) {
        id = a;
    }

    public void set_2(int b) {
        ed = b;
    }

    public void set_3(String p) {
        name = p;
    }

    public int get_1() {
        return id;
    }

    public int get_2() {
        return ed;
    }

    public String get_3() {
        return name;
    }
}

public class Setters_getters {
    public static void main(String[] args) {
        Employee r = new Employee();
        r.set_1(20);
        r.set_2(40);
        r.set_3("Srikanta");
        System.out.println(r.get_1());
        System.out.println(r.get_2());
        System.out.println(r.get_3());

    }

}
