public class Ternary {
    public static void main(String[] args){
        int age=20;
        String status = (age>=18)?"Adult":"Minor";
        System.out.println(status);

        int a=10, b=20;
        int max = (a>20)?a:b;
        System.out.println("Max: "+max);

        int marks = 90;
        String grade = (marks>=90)?"A":(marks>=75)?"B":(marks>=60)?"C":"F";
        System.out.println("Grade: "+grade);
    }
}
