class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }
    void makeSound() {
        System.out.println(name+" makes a generic sound");
    }
    void eat(){
        System.out.println(name +" eats");
    }
}

class Dog extends Animal {
    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    Cat(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println(name + "meow! meow!");
    }
}

class Cow extends Animal {
    Cow(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println(name + " Moo Moo!");
    }
}

public class Overridingdemo {
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        Cat c = new Cat("Whiskers");
        Cow cw = new Cow("Nandi");

        d.makeSound();
        c.makeSound();
        cw.makeSound();

        d.eat();
        c.eat();
        cw.eat();
    }
}
