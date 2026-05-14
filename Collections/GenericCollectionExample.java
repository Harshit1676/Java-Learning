// package Collections;

import java.util.*;

class Student{
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return name+"("+marks+")";
    }
}
public class GenericCollectionExample {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice",90));
        students.add(new Student("Bob",95));
        students.add(new Student("Charliee",80));

        students.sort((a,b)->b.marks-a.marks);
        System.out.println("Top Students: "+students);

        HashMap<Integer,String> idMap = new HashMap<>();
        idMap.put(101,"Alice");
        idMap.put(102,"Bob");
        System.out.println("Student 101: "+idMap.get(101));

        HashSet<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Java");
        System.out.println("Courses: "+courses);

        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.offer("Grade Papers");
        taskQueue.offer("Send Results");
        taskQueue.offer("Update Records");
        while(!taskQueue.isEmpty()){
            System.out.println("Processing: "+taskQueue.poll());
        }
    }
}
