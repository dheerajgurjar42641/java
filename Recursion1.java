import java.util.*;
public class Recursion1 {
    static int p(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*p(n-1);
    }
public static void main(String[] args){
        p(5);
        System.out.println(p(5));

    }
    
}
