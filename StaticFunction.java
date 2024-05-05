public class StaticFunction {
    /*in the following public and static is optional */
    public static int addTwoNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static String vendingMachine(int menu){
        if(menu == 1){
            return "Coke";
        }
        if(menu == 2){
            return "Water";
        }
        if(menu == 3){
            return "Frooti";
        }
        return "Nothing";
    }
    public static boolean checkEven(int n){
        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static String checkEligible(int age, String name){
        if(age<18){
            return "Sorry" +name+", you are not eligible";
        }else{
            return "Congratulation "+name+ ", you are eligible";
        }
    }

    public static double makeMultiply(double num1, double num2){
        return num1 * num2 ; 
    }
    public static void main(String[] args) {
        //If a function is static no need to make object
        //IF the function is static in same class you can simple call the method
        int sumReturn = addTwoNumber(10, 30);
        System.out.println("The sum is "+ sumReturn);

        String Frooti = vendingMachine(3);
        System.out.println("Frooti check " + Frooti);

        /*task make a function checkEven
         * that takes one int
         * that returns a boolean
         * if the int is even return true else false
         */
        boolean evenNum = checkEven(10);
        System.out.println(evenNum); 

        /*task 2
         * make a function checkEligible
         * that takes one int age, one String name
         * If the age is <18
         * return String "Sorry name, you are not eligible"
         * relse return "Congratulations name, you are eligible"
         */

        String details = checkEligible(18, "hero");
        System.out.println(details);

         /*task 3
          * Make a function makeMultiply
          that takes 2 double
          return a double with the multiplication of two.
          */

          double multiply = makeMultiply(1, 2);
          System.out.println((multiply));
    }
}
