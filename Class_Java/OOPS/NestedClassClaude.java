class University {
    static String UniversityName = "Lovely Professional University";
    String location = "Jalandhar";

    static class Department {
        String deptName;
        Department(String name){
            this.deptName = name;
        }
        void display(){
            System.out.println("University : "+UniversityName);
            System.out.println("Dept : "+deptName);
        }
    }
}

public class NestedClassClaude {
    public static void main(String[] args) {
        University.Department dept = new University.Department("Computer Science");
        dept.display();
    }
}
