// Exercise7.java
/*
Turn the Incrementable code fragments into a working program.
*/

class StaticTest {
    static int i = 47;
}

public class Exercise7 {
    static void increment() { StaticTest.i++; }

    public static void main(String[] args) {
        Exercise7 ex7 = new Exercise7();
        ex7.increment();
        Exercise7.increment();
        increment();
    }

}