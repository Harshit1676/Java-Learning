class Student {
    public String name;
    protected int marks;
    int rollno;
    private String password;

    public void display(){
        System.out.println(name + " " + marks + " " + rollno + " "+ password);
    }
}
public class class_demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Harshit";
        s.marks = 97;
        s.rollno = 44;
        // s.password = "1234"; // error: private can't access
        s.display();

    }    
}
