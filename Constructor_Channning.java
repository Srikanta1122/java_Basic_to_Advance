class A
{
    A()
    {
        this(5);
        System.out.println("A");
    }
    A(int x)
    {
        this(12,20);
        {
            System.out.println("one argument");
        }
    }
    A(int x, int y)
    {
        System.out.println(x*y);
        System.out.println("two argument");
    }
}

public class Constructor_Channning 
{
    public static void main(String[] args) 
    {
      A obj =new A();  
    }
    
}
