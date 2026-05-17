// WITHOUT INHERITANCE — duplicate code everywhere!

// Inheritance lets a child class acquire all fields and methods
//  of a parent class automatically — no copy-paste needed.

// BENEFITS:
//   ✓ Code Reusability (write once, use everywhere)
//   ✓ Maintainability (change parent → all children get update)
//   ✓ Extensibility (add new child without touching parent)
//   ✓ Polymorphism (treat children as parent type)

class Animal {
    String name;
    int age;

    Animal(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Animal Constructor called!");
    }
    void eat(){
        System.out.println(name+" eats");
    }
    void sleep(){
        System.out.println(name + " Sleeps");
    }
    void breath(){
        System.out.println(name+" breathes");
    }
}

class Dog extends Animal {
    String breed;
    Dog(String name, int age,String breed){
        super(name,age);
        this.breed = breed;
        System.out.println("Dog Constructor called!");
    }
    void bark(){
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    String color;
    Cat(String name,int age,String color){
        super(name,age);
        this.color = color;
        System.out.println("Cat Constructor called!");
    }
    void meow(){
        System.out.println(name+" says, meow");
    }
}
public class inheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Rex",3,"Labrador");
        d.eat();
        d.sleep();
        d.breath();
        d.bark();

        System.out.println(d.name);
        System.out.println(d.breed);

        Cat c = new Cat("Whiskers",2,"White");
        c.eat();
        c.sleep();
        c.breath();
        c.meow();

        System.out.println(c.name);
        System.out.println(c.color);
    }
}
