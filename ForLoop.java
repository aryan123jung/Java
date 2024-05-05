public class ForLoop {
    public static void main(String[] args) {
        /*use for loop when condition is fixed */
        for(int index = 0; index < 5; index ++){
            System.out.println("Loop running " +index);
        }

        /* Decrement loop */
        for(int index = 10; index >=0; index --){
            System.out.println("Loop running " +index);
        }
        /* Make the loop table for this */

        /* task 
         * Make a multiplication table of 2
         * print like the following
         * 2 x 1 = 2
         * 2 x 2 = 4
         * .
         * .
         * 2 x 10 = 20
         * note: initialize 1
         * condition <=10 or ,11
         * increment ++
        */
        for(int index = 1; index <=10; index ++){
            System.out.println("2 x "+ index + " = "+ index*2);
        }
 
        /*nested loop */
        for(int outer = 0; outer <3; outer ++){
            for(int inner = 2; inner >=0; inner --){
                System.out.println("Inner " + inner );
            }
            System.out.println("Outer " + outer);
        }

        /*Task use nested loop to do the following
         * Make multiplication table from 1-10
         * eg:
         * 1 x 1 = 1
         * 1 x 2 = 1
         * .
         * 1 x 10 = 10
         * .
         * .
         * Multiplication of 10
         * 10 x 1 = 10
         * 10 x 2 = 20
         * .
         * 10 x 10 =100
         * 
         * initialize 1
         * <=10
         * ++
         */


        for(int index = 1; index <=10; index ++){
            for(int index2 = 1; index2 <=10; index2 ++){
            
            System.out.println(index + " x " + index2 + " = " + index2*index); 
        }
        }
    }
}
