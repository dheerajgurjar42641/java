import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
        System.out.println(list);
        list.set(2, 6);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list);
    }
}
