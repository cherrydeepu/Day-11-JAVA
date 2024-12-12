import java.util.*;
class Arraylist1{
    public static void main(String args[]){
        ArrayList <Integer>a=new ArrayList< >();
        a.add(22);
        a.add(18);
        a.add(11);
        System.out.println(a);
        //adding at particular index
        a.add(1,10);
        System.out.println(a);
        //modifying
        a.set(2,22);
        System.out.println(a);
    }
}