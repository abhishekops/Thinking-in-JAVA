// Exercise5.java
/*
Modify the previous exercise so that the values of the data in DataOnly are assigned to and printed in main( ).
*/
public class Exercise5 {
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
        Exercise5 ex5 = new Exercise5();
        ex5.i = 47;
        ex5.d = 1.1;
        ex5.b = false;

        System.out.println("i = " + ex5.i);
        System.out.println("d = " + ex5.d);
        System.out.println("b = " + ex5.b);
    }
}