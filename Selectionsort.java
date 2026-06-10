import java.util.*;
public class Selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            int val = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < val) {
                    min_index = j;
                    val = arr[j];} }
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;}
        System.out.println("sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");}
        sc.close(); }}