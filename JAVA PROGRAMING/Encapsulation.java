/*  Encapsulation */

class Employee {
    private int empid;

    public void setEmpid(int x) {
        empid = x;

    }

    public int getEmpid() {
        return empid;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(100);
        System.out.println("Employee id is " + e.getEmpid());
    }

}
