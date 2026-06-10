import java.util.*;
// array list
public class Main5 {
    public static void main(String[] args) {
        List<String> codingLanguages = new ArrayList<>();
        codingLanguages.add("java");
        codingLanguages.add("python");
        codingLanguages.add("cpp");
        codingLanguages.add("javascript");
        System.out.println(codingLanguages);
        codingLanguages.add(1,"rust");
        codingLanguages.add(3,"go");
        System.out.println(codingLanguages);
        System.out.println("the value at 2nd index is  "+codingLanguages.get(2));
        codingLanguages.set(2, "anaconda");
        System.out.println(codingLanguages);
        //remove
        codingLanguages.remove(2);
        System.out.println(codingLanguages);
        Collections.sort(codingLanguages);
        // System.out.println(codingLanguages);
        // Collections.sort(null);
        System.out.println(codingLanguages);
        System.out.println("the size of array "+codingLanguages.size());
        // for each
        for(String s:codingLanguages){
            System.out.println("language : "+s);
        }
    }
}
