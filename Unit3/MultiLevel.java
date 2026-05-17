class Vehicle {
    String brand;
    int speed;
    Vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void move(){
        System.out.println(brand + " moves at"+ speed+ " km/h");
    }
}
class Car extends Vehicle {
    int numDoors;
    Car(String brand,int speed,int numDoors){
        super(brand,speed);
        this.numDoors = numDoors;
    }
    void honk(){
        System.out.println(brand + ": beep beep!");
    }
}
class ElectricCar extends Car {
    int battery;
    ElectricCar(String brand, int speed,int numDoors, int battery){
        super(brand,speed,numDoors);
        this.battery = battery;
    }
    void charge(){
        System.out.println(brand + " charging...Range "+ battery + "km");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("Tesla",250,4,500);
        e.move();
        e.honk();
        e.charge();

        System.out.println(e.brand);
        System.out.println(e.numDoors);
        System.out.println(e.speed);
        System.out.println(e.battery);
    }   
}
