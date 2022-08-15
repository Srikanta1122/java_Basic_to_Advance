// import java.util.Scanner;
// class Check
// {
//     int n,avg;
//     void function()
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number of mark out of 500:");
//         n=sc.nextInt();
//         avg=n/5;
//         System.out.println("Avg. of the mark is :"+ avg);

//     }
// }
// public class Mark {
//     public static void main(String[] args) {
//      Check r=new Check();
//      r.function();   
//     }
    
// }

import java.util.Scanner;
class Check
{
    int n1,n2,n3,n4,n5,total,avg;
    void function()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n1:");
        n1=sc.nextInt();
        System.out.println("Enter the number of n2:");
        n2=sc.nextInt();
        System.out.println("Enter the number of n3:");
        n3=sc.nextInt();
        System.out.println("Enter the number of n4:");
        n4=sc.nextInt();
        System.out.println("Enter the number of n5:");
        n5=sc.nextInt();
        total=n1+n2+n3+n4+n5;
        System.out.println("total mark is :"+total);
        avg=(n1+n2+n3+n4+n5)/5;
        System.out.println("Avg. of the mark is :"+ avg);

    }
}
public class Mark {
    public static void main(String[] args) {
     Check r=new Check();
     r.function();   
    }
    
}

