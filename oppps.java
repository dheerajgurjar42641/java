import java.util.*;

class Suraj{
    static int roll=90;
    static void compre(){
        Integer a1 = 90;
    Integer a2 = 90;
    System.out.println(a1==a2);
    }
    // //autoboxing--->conversion of primitive to objects
    // .valueoof(10);
    // // unboxing --->ojects to primitive
    // int y = a1;

    // if( a1 == a2 ){
    //     System.out.println("true");
    // }else{
    //     System.out.println("false");
    // }
    static void display(){
        System.out.println("something");

    }
}
public class oppps {
    public static void main(String[] args) {
        System.out.println(Suraj.roll);
        Suraj.display();
        Integer a1 = 128;
        Integer a2 = 128;
        System.out.println(a1.equals(a2));
        Suraj.compre();
        Integer c =20 ;
      
        c= Integer.valueOf(10);
        System.out.println(c);
        int y = a1;
        //ArrayList<Integer>={1,2,3,4};
    }
}
