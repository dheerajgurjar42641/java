import java.util.*;
public class secondlarge {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int n = arr.length;
        Arrays.sort(arr);
        int l = arr[n-1];
        for (int i = n-2;i>= 0 ; i++){
            if(arr[i] != l)
                System.out.println(arr[i]);

        }
        System.out.println("-1"); 
    }
}
