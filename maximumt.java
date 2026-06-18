import java.util.*;
public class maximumt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();}
        int maxLen = 1;
        int currentLen = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                currentLen++;
                maxLen = Math.max(maxLen,currentLen);
            } else {
                currentLen=1;
            }
        }
        System.out.println(maxLen);
        sc.close();
    }
}
