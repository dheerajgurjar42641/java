import java.util.Scanner;

public class strbuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string which is palandrom or not a palandrom :");
        String str1 = sc.nextLine();
        String str = str1.toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb); 
        if (str.equals(sb.toString())){
            System.out.println("our string "+sb+" is an panlandrom");
        }else{
            System.out.println("our string  "+sb+ " is not a panlandrom");
        }
    }
}
