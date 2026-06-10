import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        Set<String> cars1 = new HashSet<>();
        Set<String> cars2 = new TreeSet<>();
        cars1.add("maruti");
        cars1.add("kia");
        cars1.add("toyota");cars1.add("Maruti");cars1.add("kia");
        System.out.println(cars1);
        cars2.add("maruti");
        cars2.add("kia");
        cars2.add("toyota");cars2.add("Maruti");cars2.add("kia");
        System.out.println(cars2);
        if(cars1.contains("Kia")){
            System.out.println("maruti is present");
        }else{
            System.out.println("not present");
        }
        for(String s : cars1){
            System.out.println("name of car is "+s);
        }
        System.out.println(cars1.remove("maruti"));

    }
}
//you are given a list of integer that contain many duplicates i want you to remove all duplicates 
