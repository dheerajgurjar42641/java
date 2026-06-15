import java.util.Scanner;

public class Tree1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[8][8];
        for(int i=0;i<6;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u][v] = 1;
            arr[v][u] = 1;
        }
    }
}
