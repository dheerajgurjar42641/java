import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n+" is an even");
        else
            System.out.println(n+"is an odd");
    
    }
}
