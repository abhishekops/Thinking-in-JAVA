// Exercise12.java
/*
Find the code for the second version of HelloDate.java, which is the simple comment documentation example. 
Execute Javadoc on the file and view the results with your Web browser.
*/

import java.util.*;

/** The first Thinking in Java example program.
 * Displays a date and today's date.
 * @author Abhishek
 * @author Self :)
 * @version 1.0
 */

 public class Exercise12 {
     /** Entry point to class and application.
      * @params args array of string arguments.
      * @throws exceptions No Exceptions thrown.
      */

    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
 }