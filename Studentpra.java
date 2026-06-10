public class Studentpra {
    public static void main(String[] args) {
        Student s1 = new Student("Jony", 420);
        Faculty f1 = new Faculty("lakya", 4, "Java");
        s1.display();
        System.out.println(); 
        f1.display();
    }
}
class Student {
    String name;
    int rollno;

    Student(String name1, int rollno1) {
        this.name = name1;
        this.rollno = rollno1;
    }

    void display() {
        System.out.println("Student Details:");
        System.out.println("Student name is: " + name);
        System.out.println("The roll no is: " + rollno); 
    }
}

class Faculty {
    String name;
    int experienceYear; 
    String sub;

    Faculty(String name2, int experienceYear2, String sub2) {
        this.name = name2;
        this.experienceYear = experienceYear2;
        this.sub = sub2;
    }

    void display() {
        System.out.println("Faculty Details:"); 
        System.out.println("Name of the faculty: " + name); 
        System.out.println("Experience of faculty (years): " + experienceYear); 
        System.out.println("Subject of faculty: " + sub); 
    }
}

