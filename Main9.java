import java.util.*;
@FunctionalInterface
interface Calculator{
    int operate(int a,int b);
}
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1 ---");
        int num1 = sc.nextInt();
        System.out.println("enter num 2 ---");
        int num2 = sc.nextInt();
       Calculator addition = (a,b) -> (a+b);
       System.out.println("the addition of 6 and 7 is "+addition.operate(num1,num2));
       Calculator multiply = (a,b) -> (a*b);
       System.out.println("the multiply of 6 and 7 is "+multiply.operate(num1,num2));
       Calculator divide = (a,b) -> {
           try{
               return a/b;
           }catch(Exception e){
               System.out.println(e);
               return 0;
           }
       };
       System.out.println("the division os ---"+divide.operate(num1,num2));
    }
}
