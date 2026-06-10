import java.util.*;
 
public class Hq9p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        
        boolean producesOutput = false;
        
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == 'H' || c == 'Q' || c == '9') {
                producesOutput = true;
                break;
            }
        }
        
        if (producesOutput) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}