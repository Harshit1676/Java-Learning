import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;
    int id;

    Student(String name, int marks, int id){
        this.name = name;
        this.marks = marks;
        this.id = id;
    }

    @Override
    public int compareTo(Student other){
        // Positive -> this > other -> this goes Right (higher marks = later)
        // Negative -> this < other ->this goes leeft (lower marks = earlier)
        // Zero -> duplicates -> TreeSet Rejects (Careful!)
        return this.marks-other.marks;
        // if marks are equal, returns 0 -> treated as same student->lost!
    }
    // Fix: if marks equal, compare by name to avoid false duplicates
    // @Override
    // public int compareTo(Student other) {
    //     if (this.marks != other.marks) return this.marks - other.marks;
    //     return this.name.compareTo(other.name);  // secondary sort
    // }

    @Override
    public String toString(){
        return name + "(" + marks + ")";
    }
}
public class ComparableDemo {
    public static void  main(String[] args){
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Alice",90,1));
        students.add(new Student("Bob",75,2));
        students.add(new Student("Charlie",85,3));
        students.add(new Student("Alex",75,4));

        // Alex has same marks as Bob (75) → compareTo returns 0
        // TreeSet thinks it's a DUPLICATE → Diana is REJECTED!
        // This is a COMMON MISTAKE — fix with secondary sort

        System.out.println(students);
        // [Bob(75), Charlie(85), Alice(90)]
        // Alex was rejected! (same marks as Bob)

        TreeSet<Student> correct = new TreeSet<>((a,b)->{
            if(a.marks != b.marks) return a.marks-b.marks;
            return a.name.compareTo(b.name);
        });
        correct.addAll(students);
        correct.add(new Student("Alex",75,4));
        System.out.println(correct);
    }
}
