import java.util.Scanner;

public class counteven {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int evencount = 0;
        int oddcount = 0;
        for(int i = 0;i<size;i++){
            if(arr[i]%2==0){
            evencount++;
        }else{
            oddcount++;
        }
        }
        System.out.println("the evencount of our array is---->"+ evencount);
        System.out.println("the oddcout of our array --->"+oddcount);
    }    
}
