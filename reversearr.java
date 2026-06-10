import java.util.*;

public class reversearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        for (int i= 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       for(int last = n-1;last>=0;last--){
        System.out.print(" "+arr[last]);
       }
    }
}
