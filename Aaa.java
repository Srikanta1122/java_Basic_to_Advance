import java.util.Scanner;
class Day
{
    void d()
    {
        int month,number,rem,m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Month:");
        month=sc.nextInt();
        
        
        // if(day>31)
        // {
        //     month++;
        // }
        if(month==1)
        {
            System.out.println("January");
        }
        if(month==2)
        {
            System.out.println("February");
        }
        if(month==3)
        {
            System.out.println("March");
        }
        if(month==4)
        {
            System.out.println("April");
        }
        if(month==5)
        {
            System.out.println("May");
        }
        if(month==6)
        {
            System.out.println("June");
        }
        if(month==7)
        {
            System.out.println("July");
        }
        if(month==8)
        {
            System.out.println("August");
        }
        if(month==9)
        {
            System.out.println("September");
        }
        if(month==10)
        {
            System.out.println("October");
        }
        if(month==11)
        {
            System.out.println("November");
        }
        if(month==12)
        {
            System.out.println("December");
        }

        {
            
        Scanner p=new Scanner(System.in);
        System.out.println("Enter The number:");
        number = p.nextInt();

        rem = number % 7;
        m = rem;
        switch (m) {
        case 1:
        System.out.println("Sunday");
        break;
        case 2:
        System.out.println("Monday");
        break;
        case 3:
        System.out.println("Tuesday");
        break;
        case 4:
        System.out.println("Wenesday");
        break;
        case 5:
        System.out.println("Trusday");
        break;
        case 6:
        System.out.println("Firday");
        break;
        case 7:
        System.out.println("Saterday");
        break;
        default:
        System.out.println("Invalid sentex");
        }
        }
}
}
class Aaa
{
    public static void main(String args[]) 
    {
        Day a = new Day();
        a.d();
        
    }
}

