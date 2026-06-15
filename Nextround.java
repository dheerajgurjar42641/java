import java.util.Scanner;

public class Nextround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count =0;
        int temp = arr[k-1];
        for(int i=0;i<n;i++){
            if(arr[i]>=temp&& arr[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
// 4 2
// 0 0 0 0
// 8 5
// 10 9 8 7 7 7 5 5

