class Student {
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}
public class Doubt {
    public static void main(String[] args) {
        Student s = new Student("Alice",21);
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
