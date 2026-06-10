class studclass {
    String name="ragav";
    int rollno=78;
    int a,r;
    // studclass{
    //     this(10);
    //     System.out.println("Default");
    // }
    studclass(int age,int rollno,String name,int roomno){
        a = age;
        r = roomno;
       this.rollno =rollno;
        this.name=name;

    }
    void display(){
        System.out.println("name is "+name+"\nrollno is   "+rollno+"  age is "+a+"   class room no is"+r);
    }
}
class Student{
    public static void main(String[] args) {
        studclass obj1 = new studclass(34,02,"heera bete",004);
        studclass obj2 = new studclass(24,01,"aja",0056);

        // obj1.name="dheeraj";
        obj1.display();
        // obj2.name="shyam";
        obj2.display();
    }
}
