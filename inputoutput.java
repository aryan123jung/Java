import java.util.Scanner;
/*or
 * import java.util.*;
 */
public class inputoutput {

    public static void main(String[] args) {
        /*user output */
        System.out.println("This setence will have line break");
        /*system.out,print */
        System.out.print("This will not have break");
        System.out.print("This line will continue. \n");
        /*string formatting using system.out.print
         * %s string, %d integral, %f floating point, %b boolean
         * this will also not break line
         */
        System.out.printf("Hello %s, goodmorning", "World");
        System.out.printf("The number is %d",10);
        /*can use multiple formatter */
        System.out.printf("\nThe floating %f and boolean %b",10.3f, false);

        /*user input
         * import java.util.scanner; // copy this line at the top of the code
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("The following take whole sentence");
        String wholeOutput = scan.nextLine();
        System.out.println("The input taken is " + wholeOutput);
        System.out.println("The following takes integer");
        int intInput = scan.nextInt();
        System.out.println("The input taken is " + intInput );
        System.out.println("The following take double");
        double doubleInput = scan.nextDouble();
        System.out.println("The input taken is " + doubleInput);
        System.out.println("The following takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input taken is "+ booleanInput);
        scan.close(); // you must close the scanner once all input is taken


        /*task
         * make a new scanner ojbect scan1
         * prompt the following and take input
         * what is your name? save the input to string -> name
         * are you over 18? save the input to boolean -> status
         * how many sibling? save the input to integer -> sibling
         * print the following
         * hello name,
         * over 18?, status
         * you have sibiling number of sibling
         */

         Scanner scan1 = new Scanner (System.in);
         System.out.println("What is ypur name?");
         String name = scan1.nextLine();
         System.out.println("over 18?");
         boolean status = scan1.nextBoolean();
         System.out.println("How many siblings?");
         int sibling = scan1.nextInt();
         System.out.println("Hello " + name);
         System.out.println("over 18?" +  status);
         System.out.println("you have " + sibling + "sibling.");
         scan1.close();
         
    }
    
}