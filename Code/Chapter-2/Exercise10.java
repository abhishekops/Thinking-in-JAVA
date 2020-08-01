// Exercise10.java
/* 
Write a program that prints three arguments taken from the command line. To do this, 
you’ll need to index into the command-line array of Strings.
*/

public class Exercise10 {
    public static void main(String[] args) {
        if(args.length < 3) { System.err.println("Need 3 arguments"); System.exit(1);}

        System.out.println("Argument 0 = " + args[0]);
        System.out.println("Argument 1 = " + args[1]);
        System.out.println("Argument 2 = " + args[2]);
    }
}