import java.util.*;

public class Newyeargarland {
    public static void main(String[] args) {
        //1279A
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();
            int sum = r+g+b ;
            int largeno = Math.max(r,Math.max(g,b) );
            int rmn = sum-largeno ;
            if (largeno-1 <= rmn) {
                System.out.println("YES");     
            }else{
                System.out.println("NO");
            }

        }
        
    }
}
