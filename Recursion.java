public class Recursion {
      public static void main(String[] args) {
        int sum = p(3);
        System.out.println(sum);
    
    }
    static int p(int n){
        if(n==0){
            return 0;
        } 
            return n +(n-1);
   }
}

