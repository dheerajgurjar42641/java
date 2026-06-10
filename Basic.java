import java.util.*;
public class Basic {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number from 1,2,3,4,5----->");
        int a = sc.nextInt();
        for(int count=0;a>=count;count++){
            System.out.println(count+" ");
        }
    }
}
