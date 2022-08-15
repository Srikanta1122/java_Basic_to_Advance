import java.util.Scanner;

class First
{
    double cel,faren;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the celcious value: ");
        cel=sc.nextDouble();
        faren=(9*cel+160)/5;
        System.out.println("The Farenhite value of the Calcious is :"+faren);
    }
}

public class Cel_Faren {
    public static void main(String args[])
    {
        First r=new First();
        r.function();
    }
    
}
