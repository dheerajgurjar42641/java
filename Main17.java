import java.util.Scanner;

public class Main17 {
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
        int prefix [] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int j = 0; j < q; j++) {
            System.out.println("enter the value of l and r");
            int l = sc.nextInt();
            int r = sc.nextInt();
            l-=1;
            r-=1;
            int sum = prefix[r] - prefix[l];
            System.out.println("total sum is: ");
            System.out.println(sum);
        }
    }
}
