import java.util.Scanner;
//lagest no in 3 nos
public class Lagestno {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("enter b");
        int b= sc.nextInt();
        System.out.println("enter c");
        int c= sc.nextInt();
        if( a > b && a > c){
            System.out.println("a is largest no");
        }else if( b > a && b > c){
            System.out.println("b is largest no");
        }else{
            System.out.println("c is largest no");
        }
    }
}
