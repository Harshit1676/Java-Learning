import java.util.*;
class Student {
    String name;
    int rollNo;
    double marks;

    Student(){
        name = "Unknown";
        rollNo = 0;
        marks=0.0;
    }
    Student(String n, int r, double m){
        name=n;
        rollNo = r;
        marks=m;
    }

    void display(){
        System.out.println("Roll "+rollNo +" |Name: "+name+" |Marks: "+marks);
    }

    String getGrade() {
        if(marks>=90) return "O";
        else if(marks>=80) return "A";
        else if(marks>=70) return "B";
        else if(marks>=60) return "C";
        else  return "F";
    }
}

public class OOPSDemo{
    public static void main(String[] args) {
        Student s1 = new Student("Alice",101,92.5);
        Student s2 = new Student("Bob",102,90);
        Student s3 = new Student();

        s1.display();
        s2.display();
        s3.display();

        System.out.println(s1.name+" -> "+s1.getGrade());
        System.out.println(s2.name+" -> "+s2.getGrade());
    }
}
