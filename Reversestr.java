import java.util.*;

public class Reversestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string :");
        String str = sc.nextLine();
        int n = str.length();
        String rev = ""; 

        for(int i=n-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println("reverse string is--->"+rev);
    }
}
