import java.util.*;
import java.util.stream.Collectors;
public class Main12 {
    public static void main(String[] args) {
        List<String> rawData = List.of("apple","banana","awacado","kiwi","aam","anar");
        // we have create a new list is empaty and holding final result
        List<String>onlyAwords = rawData.stream()
        .filter(word -> word.startsWith("a"))

        .collect(Collectors.toList());
        System.out.println("Organal list "+rawData);
        System.out.println("new list "+onlyAwords);
    }
}
