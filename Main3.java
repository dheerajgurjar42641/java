class Calculator{
    // overloading
    int add(int a, int b){
        return a+b;
    }
    double add (double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
//---overriding
class Advancecalculater extends Calculator{
   // @Override
    int ad (int a, int b){
        System.out.println("Method Overriding!!");
        return a+b+10;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("sum of two int  "+obj.add(2,4)+"sum of two double "+obj.add(3.43,35.4)+"addition of three no  "+obj.add(2,5,67));
        Advancecalculater obj2 = new Advancecalculater();
        System.out.println(obj2.add(2,45));
    }
}
