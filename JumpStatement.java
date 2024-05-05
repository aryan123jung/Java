public class JumpStatement {
    public static void main(String[] args) {
        /*break and continue are jump statement in java */
        /* break will terminate the loop */
        for(int index = 0; index < 5 ; index++){
            if(index == 3){
                break; //this line break the loop scope
            }
            System.out.println("Index" + index);
        }
        /* can be used in any loop */
        int count = 0;
        while(count <=10){
            if (count == 1){
                break;
            }
            System.out.println("Count" + count);
            count++;
        }


        /* continue statement will skip the loop */
        for(int index =0; index <5; index ++){
            if(index == 3){
                continue;
            }
            System.out.println("Continue index" + index);
        }
        /* Task WAP4 to run for loop from -5 to 5
         * break the loop if the index is positive
        */
        for (int i = -5; i <= 5; i++) {
            System.out.println("Current index: " + i);
            if (i >= 0) {
                System.out.println("Index is positive. Breaking the loop.");
                break;
            }
        }


        /* Task 2
         * Loop from 1-20 using any loop 
         * only print the value of it is even 
         * use continue to do this task
         */
        for(int i = 1; i<=20; i++){
            if(i % 2 == 0){
                System.out.println("The number is" + i);
            }
            else{
                continue;
                }
        }
    }
}
