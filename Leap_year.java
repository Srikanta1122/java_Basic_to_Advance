import java.util.Scanner;

class Check{
    int n;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        if(n%400==0)
        System.out.println("The year is leap year");
        else if(n%4==0)
        System.out.println("The year is leap year");
        else if(n%100==0) 
        System.out.println("The year is not leap year");
        else 
        System.out.println("The year is not leap year");
    }
}
public class Leap_year {
    public static void main(String[] args) {
        Check r=new Check();
        r.function();   
    }
    
}
