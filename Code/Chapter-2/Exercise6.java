// Exercise6.java
/*
Write a program that includes and calls the storage( ) method defined as a code fragment in this chapter.
*/
public class Exercise6 {
    String s = new String("Hello, World!");
    int storage(String s) {
        return s.length() * 2;
    }

    void print() {
        System.out.println("Storage = " + storage(s));
    }

    public static void main(String[] args) {
        Exercise6 ex6 = new Exercise6();
        ex6.print();
    }
}