import java.util.*;
class Bacha{
    int Rollno;
    String name;
    int marks;
    Bacha(int Rollno,int marks,String name){
    this.Rollno = Rollno;
    this.name = name;
    this.marks = marks;
    }
    @Override
    public String toString(){
        return Rollno+" "+name +" " +marks;
    }
}
// class MarksComparator implements Comparator<Bacha>{
//     @Override
//     public int compare(Bacha b1,Bacha b2){
//         return b1.marks - b2.marks;
//     }
// }
public class Main10 {
    public static void main(String[] args) {
        List<Bacha> bacha = new ArrayList<>();
        bacha.add(new Bacha(2, 67, "shyam"));
        bacha.add(new Bacha(3, 87, "salman"));
        bacha.add(new Bacha(4, 65, "amarkushwah"));
        bacha.add(new Bacha(5, 77, "ram"));
        // Collections.sort(bacha,new MarksComparator());
        Collections.sort(bacha,(b1,b2)->(b2.marks-b1.marks));
        System.out.println(bacha);

    }
}
