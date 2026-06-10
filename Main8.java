import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main8 {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(12, "Dheeraj");
        students.put(67, "shyam");
        students.put(76,"gungum" );
        students.put(84, "ayaqn");
        students.put(87, "garima");
        System.out.println(students);
        students.put(12, "aman");
        System.out.println(students);
        System.out.println("the value of 67 key is "+students.get(67));
        for(Map.Entry<Integer,String> map :students.entrySet()){
            System.out.println("the key is "+map.getKey()+" the value is "+ map.getValue());
        }
        List<Integer> list1 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>(list1);
    }
}
