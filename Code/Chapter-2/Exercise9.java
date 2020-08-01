// Exercise9.java
/*
Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.
*/

public class Exercise9 {
    public static void main(String[] args) {
        Boolean bool = true;
        boolean bo = bool;
        System.out.println("Boolean = " + bo);
        
        Byte by = 1;
        byte b = by;
        System.out.println("Byte = " + b);

        Character ch = 'c';
        char c = ch;
        System.out.println("Char = " + c);

        Short sh = 1;
        short s = sh;
        System.out.println("Short = " + s);

        Integer in = 1;
        int i = in;
        System.out.println("Integer = " + i);

        Long lo = 1L;
        long l = lo;
        System.out.println("Long = " + l);

        Float fl = 1.0f;
        float f = fl;
        System.out.println("Float = " + f);

        Double dob = 1.0d;
        double d = dob;
        System.out.println("Double = " + d);
    }

}