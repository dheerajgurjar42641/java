import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            int n1 =sc.nextInt();
            int n2 =sc.nextInt();
            int n3 =sc.nextInt();
            if(n1+n2+n3>=2){
                count++;
            }

        }
        System.out.println(count);
    }
}
