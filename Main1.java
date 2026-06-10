class Chatre{
    String name ;
    int rollno;
    int marks;
}
public class Main1 {
    public static void main(String[] args) {
        Chatre chatre1 = new Chatre();
        Chatre chatre2 = new Chatre();
        chatre2.name = "shyam";
        chatre2.rollno = 54;
        chatre2.marks = 70;
        chatre1.name = "somil";
        chatre1.rollno = 1;
        chatre1.marks = 20;

        System.out.println("name of 1st student is  "+chatre1.name);
        System.out.println("name of 2nd student   "+chatre2.name);
        System.out.println("rollno of 1st student is   "+chatre1.rollno);
        System.out.println("rollno of 2st student is   "+chatre2.rollno);
    }
}
