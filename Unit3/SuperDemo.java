class Person {
    String name;
    int age;
    String address;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
    String getInfo(){
        return "Person: "+name;
    }
}
class Student extends Person{
    int rollNo;
    double gpa;
    String address = "Campus Hostel";

    Student(String name,int age,int rollNo,double gpa){
        super(name, age);
        this.rollNo = rollNo;
        this.gpa = gpa;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Roll No: "+rollNo+" GPA: "+gpa);
    }
    void showAddresses(){
        System.out.println("Student Address: " + address);
        System.out.println("Person Address: " + super.address);
    }

    @Override
    String getInfo(){
        return super.getInfo() + " |Student Roll: "+ rollNo;
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Student s = new Student("Alice",20,101,9.2);

        s.display();

        s.showAddresses();

        System.out.println(s.getInfo());
    }
}
