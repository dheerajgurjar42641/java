import java.util.*;

public class strpalandrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string :");
        String str = sc.nextLine();
        int n = str.length();
        String rev = ""; 

        for(int i=n-1;i>=0;i--){
            rev += str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("string is palandrom>");
        }else{
            System.out.println("string is not a palandrom*");
        }
    
    }
}
