// Exercise8.java
/*
Write a program that demonstrates that, no matter how many objects you create of a particular class, 
there is only one instance of a particular static field in that class.
*/

public class Exercise8 {
    static int i = 25;

    static void increment() { 
        Exercise8.i++;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Exercise8 one = new Exercise8();
        one.increment();
        Exercise8 two = new Exercise8();
        two.increment();
        Exercise8 three = new Exercise8();
        three.increment();
    }
}