// Q1)- create a class student with attribute id,name  override to string \


// Q2)- create an abstract class shape with abstract method area then subclass or child class circle and rectangle 
// take user input and print area

// Q3)- payment system using interface create an interface payment with pay method  then implement classes upi and credit card 
// based on input perform payment ex. if user type is upi then print payment done using upi 

// Q4) create an outer class with the variable x and a inner class that will print square of x

// Q5) create and interface greeting with the method greet and implement using anomynous class and print message if a object name is morning 
// then the message will be good morning 

// Q6) create a custom assumption invalid age assumption if age is less than 21 then throw and exception invalid age otherwise valid 

// Q7)- create a  functional interface named as discount there are two types of discount first is festival discount that is 30% and second is VIP discount that is 20% using lambda expression apply these two discount on price 1000 price will be in double datatype 


// Question 7

@FuntionalInterface 
interface Discount {
    double apply(double price);
}

public class Question {
    public static void main(String[] args) {
        double price = 1000.0;
        Discount festivalDiscount = (p)->p-(p*0.3);
        Discount vipDiscount = (p)->p-(p*0.2);
         
        double festivalPrice = festivalDiscount.apply(price);
        double vipPrice = vipDiscount.apply(price);

        System.out.println("Original price: "+price);
        System.out.println("After 30% festival discount"+festivalDiscount);
        System.out.println("After 20% vip discount"+vipDiscount);

    }
}