class Animal{
    void eats(){
        System.out.println("the animal eats food.");
    }
}
//single Inheritance
class Dog extends Animal {
    void bark(){
        System.out.println("The dog is barks , Woof!!");
    }
    
}// multiple Inheritance
class Puppy extends Dog{
    void cute(){
        System.out.println("The puppy is cute!!");
    }
}// Hierarchical Inheritance
class Cat extends Animal{
    void meow(){
        System.out.println(" The cat meows !!");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eats();
        Puppy p1 = new Puppy();
        p1.eats();
        p1.bark();
        p1.cute();
        Cat c1 = new Cat();
        c1.eats();
    }
}
