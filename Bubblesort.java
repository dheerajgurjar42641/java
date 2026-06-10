import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        for(int i = n-1; i>=0; i--){
            for(int j = 0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                }
        }
        System.out.println("sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");}
        sc.close();
    }
}
