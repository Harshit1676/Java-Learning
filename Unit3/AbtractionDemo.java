abstract class Shape {
    String color;
    Shape(String color){
        this.color = color;
    }
    abstract double Area();
    abstract double Perimeter();

    void displayInfo(){
        System.out.printf("Shape: %s | Color: %s | Area: %.2f | Perimeter: 5.2f%n",getClass().getSimpleName(),color,Area(),Perimeter());
    }
}
class Circle extends Shape {
    double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    double Area(){
        return Math.PI * radius * radius;
    }
    @Override
    double Perimeter(){
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {
    double l;
    double w;
    Rectangle(String color,double l,double w){
        super(color);
        this.l = l;
        this.w = w;
    }
    @Override
    double Area(){
        return l*w;
    }
    @Override
    double Perimeter(){
        return 2*l*w;
    }
}
class Square extends Shape {
    double side;
    Square(String color,double side){
        super(color);
        this.side = side;
    }
    @Override
    double Area(){
        return side*side;
    }
    double Perimeter(){
        return 4*side;
    }
}
public class AbtractionDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red",7);
        Shape s2 = new Rectangle("Blue",3,4);
        Shape s3 = new Square("Green",4);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
