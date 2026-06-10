public class Recursion {
    static void p(int n){
        if(n==0){
            return;
        }
        p(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        p(5);
    }
}
