import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num1 = 0;
        while(num1 < 0){
            System.out.println("While checks condition first");
        }
        /*Do while checks conditoin after first it */
        do{
            System.out.println("Do while checks condition after");
        }while(num1<0);
        /*This means do while loop runs at least once */

        /*Task
         * Use a while loop to
         * ask user for an int value
         * if the user input positive value
         * promt user to input negative value
         * loop untill the user input negative int value
        */

        /* Scanner scanner = new Scanner(System.in);
        
        int num;
        do {
            System.out.println("Enter a positive integer:");
            num = scanner.nextInt();
            if (num > 0) {
                System.out.println("Please enter a negative integer:");
            }
        } while (num > 0);
        
        System.out.println("Thank you for entering a negative integer.");
        
        scanner.close(); */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = scan.nextInt();
        while(input >=0){
            System.out.println("Please enter negative number");
            input = scan.nextInt();
        }
        System.out.println("The negative value is " + input);
        scan.close();
    }
}
