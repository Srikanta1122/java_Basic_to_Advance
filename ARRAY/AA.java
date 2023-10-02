abstract class Abc
{
    Abc(int a)
    {
        System.out.println(a);
    }
}

public class AA extends Abc
{
    AA()
    {
        super(20);
        System.out.println("AA class constructor");
    }
    public static void main(String[] args) 
    {
        AA obj=new AA();
        
    }
}
