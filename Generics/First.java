package Generics;
import java.util.*;

class Box { 
    private Object value;

    public void setValue(Object value){
        this.value = value;
    }

    public Object getValue(){
        return value;
    }
}

public class First {
    public static void main(String[] args){

        Box b1 = new Box();
        b1.setValue("Hello");

        String s = (String) b1.getValue();

        Box b2 = new Box();
        b2.setValue(42);

        String wrong = (String) b2.getValue(); // Runtime Error
    }
}

// ┌─────────────────────────────────────────────────────────┐
// │  PROBLEM 1: Manual casting everywhere → ugly code       │
// │  PROBLEM 2: ClassCastException at RUNTIME → dangerous   │
// │  PROBLEM 3: No type safety → bugs are hard to find      │
// └─────────────────────────────────────────────────────────┘

// Real Analogy: Imagine a locker in school. Without labels, you put in a math book, but someone else takes out expecting a physics book — crash!
//  Generics add a label to the locker.