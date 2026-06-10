import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int j= 0; j < t; j++) {
            for (int k = j+1; k < t; k++) {
                if(arr[j]-arr[k]==j-k){
                    count++;
                }
            }
        }
        System.out.println(count);

        }

}
