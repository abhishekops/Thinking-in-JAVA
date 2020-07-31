// Exercise1.java
// Prints default values for unintialised class fields.
public class Exercise1 {
    int i;
    char c;

    public void defaultInitialisation() {
        System.out.println("i = " +  i);
        System.out.println("c = " + '[' + c + ']');
    }

    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        ex1.defaultInitialisation();
    }
}
