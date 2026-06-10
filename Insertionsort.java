import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        for (int i = 0; i < n; i++) {
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;}
            System.out.println("sorted array is: ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");}
        sc.close();
        }
    }
