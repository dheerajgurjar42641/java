public class Dp1 {
    int fibo(int n){
        if(n<=1) return n;
        else return fibo(n-1)+fibo(n-2);
        int  n =30;
        int result = fibo(n);
        System.out.println(result);
    }
}
