// In java nested class refers to a class inside a class
// There are two thing in nested class - 
// When there is a need of tight cupling(one class is higly dependent on another class) then be can use nested class concept 



class Outer{
    int id;
    String name;
    private String address;

    
    public Outer(int id,String name,String address,int salary){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    class Inner{
        int age;
        String phone;
        public Inner(int age,String phone){
            this.age = age;
            this.phone = phone;
        }
        void displayInnerClass(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Phone: "+phone);
        }
    }
}
class NestedClass {
    public static void main(String args[]){
        Outer outer = new Outer(45,"Abhinav");
        Outer.Inner inner = outer.new Inner(21,"9192636569");

        inner.displayInnerClass();
    }
}