import java.util.*;
//abstract interface
abstract interface math{
    void print();
}
class d implements math
{
    //@overriding
    public void print()
    {
        System.out.println("HELLO");
    }
}
class Main{
    public static void main(String args[])
    {
        d f=new d();
        f.print();
    }
}