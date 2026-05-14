class StudentData<T>{
    private String fieldName;
    private T fieldValue;

    public StudentData(String fieldName, T fieldValue){
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public void display(){
        System.out.println(fieldName + ": " + fieldValue + " [" + fieldValue.getClass().getSimpleName() + "]");
    }
    public T getFieldValue() {
         return fieldValue;
    }
}

public class Example {
    public static void main(String[] args){
        StudentData<String> name = new StudentData<>("Name","Arjun");
        StudentData<Integer> age = new StudentData<>("Age",20);
        StudentData<Double> cgpa = new StudentData<>("CGPA",8.8);
        StudentData<Boolean> pass = new StudentData<>("Passed",true);

        name.display();
        age.display();
        cgpa.display();
        pass.display();
    }
}
