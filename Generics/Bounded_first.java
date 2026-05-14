// class Calculator<T> {
//     public double square(T num) {
//         // PROBLEM: T could be ANYTHING — String, Dog, Integer...
//         // How do we call .doubleValue() on T?
//         // We don't know if T is a number!
//         return num.doubleValue();  // COMPILE ERROR — T might be String!
//     }
// }

// // Without bounds, someone could do:
// Calculator<String> c = new Calculator<>();
// c.square("Hello");  // Nonsensical! Can't square a String



// // UPPER BOUND — T must be Number or any subclass of Number
// class Calculator<T extends Number> {
//     //                 ↑
//     //     "extends" means: T must be Number or its subclass
// }



class Calculator<T extends Number>{
    private T value;

    public Calculator(T value){
        this.value = value;
    }
    public double getDouble(){
        return value.doubleValue();
    }

    public double Square(){
        double d = value.doubleValue();
        return d*d;
    }
    public void display(){
        System.out.println("Value: "+value+ ",\nSquare: "+Square() + "\nType: "+value.getClass().getSimpleName());
    }
}
public class Bounded_first {
    public static void main(String[] args){
        Calculator<Integer> intCal = new Calculator<>(5);
        intCal.display();

        Calculator<Double> dblCal = new Calculator<>(1.5);
        dblCal.display();

        Calculator<Float> fltCal = new Calculator<>(2.0f);
        fltCal.display();
    }
}