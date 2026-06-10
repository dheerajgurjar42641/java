import java.util.Scanner;

public class Grade {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        if (n<=30){
            System.out.println("D");
        }else if (30<n && n<=60){
            System.out.println("C");
        }else if (60<n && n<=70){
            System.out.println("B");
        }else if(70<n&& n<=90){
            System.out.println("A");
        }
        else{
            System.out.println("A+");
        }
    }

}
