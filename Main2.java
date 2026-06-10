// create a parent class called shape with a string variable colour set to "red". Then,create a circle class that extends shape.
//In circle , create its own colour variable set to "blue".
class Shape{
    String colour = "Red";
}
class Circle extends Shape{
    String colour= "blue";
    void display(){
        System.out.println("the colour of circle--- "+colour);
        System.out.println("the colour of shape circle--- "+super.colour);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        //shape.colour = "Red";
        //circle.c1 = "blue";
        //System.out.println("the colour of shape is --"+shape.colour+"\nthe colour c1 of circle is ---"+circle.c1+"\nthe colour of circle shape --- "+circle.colour);
        circle.display();
    }
}
