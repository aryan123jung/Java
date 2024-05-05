import java.util.Scanner;
/*when we dont know number of intigration we use while loop */
public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        /*while takes boolen expression inside ()
         * The loop will run repeatatively when the boolen is true
         * If the boolen is false the loop will end
         */
        while(count < 5){
            System.out.println("While Loop" + count);
            ++count;
        }
        /*In while loop the condition is checked at the beginning 
         * if the conditionn is false in initial check the loop will not run*/
        System.out.println("Please type the value between 0-100");
        Scanner scan = new Scanner(System.in);
        int inputValue = scan.nextInt();
        while(inputValue < 0 || inputValue > 100){
            System.out.println("Please input between 0-100");
            inputValue = scan.nextInt();
        }
        System.out.println("End Loop");
        scan.close();
    }
}
