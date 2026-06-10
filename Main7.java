import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.addAll(list2);
        list2.add(8);list2.add(5);list2.add(33);list2.add(45);
        System.out.println(list1.containsAll(list2));
        System.out.println(list2.retainAll(list1));
        System.out.println(list1.removeAll(list2));
        System.out.println(list2);

    }
}
