import java.util.*;

public class avarage {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int d = 0;
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
            d++;
        }
        System.out.println("count digits--->"+d);

        System.out.println("the average of your array is :" + (sum / d));

    }
}
