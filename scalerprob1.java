import java.lang.*;
import java.util.*;

public class scalerprob1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c = sc.nextInt();
        if(a==b&&b==c){
            System.out.println("equilateral");
        }else if(a!=b&&b!=c&&a!=c){
            System.out.println("scalene");
        }else{
            System.out.println("isosceles");
        }
    }
}