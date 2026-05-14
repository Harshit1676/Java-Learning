public class SuperKeyword {
    class Animal {
        String color = "white";
    }

    class Dog extends Animal {
        String color = "black";

        void printColor() {
            System.out.println(color);       
            System.out.println(super.color); 
        }
    }
    
}
