import java.util.*;

public class petyastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        int ans = 0;
        for (int i =0;i<s1.length();i++){
            if(s1.charAt(i)<s2.charAt(i)){
            ans=-1;
            break;
        }else if(s1.charAt(i)>s2.charAt(i)){
            ans = 1;
            break;
        }
        }
        System.out.println(ans);
        }
    }
