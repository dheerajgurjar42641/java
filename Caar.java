class Vehicle {
    int speed;
    String colour;
    String engine;
    void run(){
        System.out.println("running");
    }
    static void brake(){
        System.out.println("applied the brake for a vehicle");
    }

    
}
class Scooty extends Vehicle  {
    Scooty(){
        super();
    }
void display(){
    // super.brake();
    // super.run();
    System.out.println("car it is");
}
}
public class Caar {
    public static void main(String[] args) {
        Scooty scooty = new Scooty();
        // Scooty.brake();
        // scooty.run();
        scooty.display();
    }
}
