import java.util.*;
interface FunctionalInterface{
    public int operation(int a,int b);
}
class Main
{
    public static void main(String args[])
    {
        FunctionalInterface add=(a,b)->(a+b);
        FunctionalInterface sub=(a,b)->(a-b);
        System.out.println(add.operation(10,5));
        System.out.println(sub.operation(10,5));
    }
}