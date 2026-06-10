import java.util.*;
public class Main11 {
    public static void main(String[] args) {
        List<Integer>numbers = List.of(1,2,3,4,5,6);
        System.out.println("kepping only the even numbers ");
        // conveyor belt start
        numbers.stream()
           .filter(n ->n%2 == 0)
           //terminal operation
           .forEach(System.out::println);
    }
}
