public class Recursion2 {
    static int fabonacci(int n){
        if(n<=1){
            return n;
        }
        return fabonacci(n-1)+fabonacci(n-2);       
    }
    public static void main(String[] args) {
        fabonacci(7);
        System.out.println(fabonacci(7));
    }
}
