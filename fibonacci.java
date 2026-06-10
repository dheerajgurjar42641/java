import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n th term of the fibonacci");
        int i;
        int n = sc.nextInt();
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for( i = 2;i<n;i++){
            fib[i] = fib[i-1] + fib[i-2];

        }
        System.out.println("fibonacci seqence--->" );
        for(i=1;i<n;i++){
            System.out.print(" "+ fib[i-1]);
        }

    }
}
