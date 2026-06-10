import java.util.*;

public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the no of queries");
        int q = sc.nextInt();
        System.out.println("enter the elements of the array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < q; j++) {
            System.out.println("enter the value of l and r");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = 0;
            for (int k = l-1; k < r; k++) {
                sum += arr[k];
            }
            System.out.println("total sum is: ");
            System.out.println(sum);
        }
    }
}
