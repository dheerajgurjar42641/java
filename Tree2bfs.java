import java.util.Scanner;

public class Tree2bfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n-1);
        int arr[][] = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u][v] = 1;
            arr[v][u] = 1;
        }
        boolean visited[] = new boolean[n+1];
    }
}
