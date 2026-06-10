import java.util.Scanner;

public class code2228 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0; i<size; i++){
        if(arr[i]==0){
            count++;
            if(arr[i]==1){
                if(arr[i]==2){
                count++;
            }
        }
    }
}
    System.out.println(count);

    }
}