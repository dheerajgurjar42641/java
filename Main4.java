// ccreate  a class called printer . overload a method called printDocument . one version takes an integer (number of copies)
// The other takes a string (a secret massage).
// 2. create a parent class appliance with a turnOn() method .create a child class toaster that overrides turnOn() to say 
// "Heating up bread". test both in your main method .
class Printer{
    void printDocument(int numberOfCopies){
        System.out.println("Printing  "+numberOfCopies+"  copies.");
    }
    //overload method
    void printDocument(String secret_message){
        System.out.println("secret_message  "+secret_message);
    }
}
// task 2 overriding method
class Appliance{
    void turnOn(){
        System.out.println("appliances truning on  ");
    }
}
class Touster extends Appliance{
    @Override
    void turnOn(){//redefines turnOn method
        
    }
}
public class Main4 {
    public static void main(String[] args) {
        System.out.println(" testing task 1 ,overloading");
        Printer myprinter = new Printer();//create a object.
        myprinter.printDocument(5);
        myprinter.printDocument("this is a lier");
        Touster myTouster = new Touster();
        myTouster.turnOn();
    }
}
