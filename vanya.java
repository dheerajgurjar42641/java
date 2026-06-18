import java.util.*;
public class vanya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int wd= 0;
        for (int i = 0; i < n; i++) {
            int ai=sc.nextInt();
            if(ai >h) {
                wd+=2;
            }else{
                wd++;
            }}
        System.out.println(wd);
        sc.close();
    }
}
