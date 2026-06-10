import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1,1,1,5,6,7,2,4,4,6,3,3,3,3,8,9,6,7));
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i : list1){
            if(freqMap.containsKey(i)==true){
                int freqOfKey = freqMap.get(i);
                freqMap.put(i,freqOfKey+1);
            }else{
                freqMap.put(i,1);
            }
        }
        for(Map)
    }
}
