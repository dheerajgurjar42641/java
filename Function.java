import java.util.Scanner;
public class Function {
    // public static int produtOfTwoNo(int a, int b){
    //     int product = a*b;
    //     return product;
    // }
    public static void factorial(int n){
        if(n<0){
            System.out.println("invaid input");
            return;
        }
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact= fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);

        //int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = produtOfTwoNo(a,b);
        // System.out.println(product);
    }
}
