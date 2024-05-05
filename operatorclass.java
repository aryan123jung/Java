public class operatorclass {
    
    public static void main(String[] args) {
        /*Arithemic operators */
        int a = 10, b = 10;
        int sum = a + b; // here the "+" is an arthematic  operators
        System.out.println("Addition for a+b is " + sum);
        System.out.println("Difference for a-b " + (a-b));
        System.out.println("Multiplication for axb is " + (a*b));
        System.out.println("Division for a/b is " + (a/b));
        System.out.println("Module for a and b is " + (a%b));
    
        /*Assigment opertaors */
        int aNumber1;
        aNumber1 = 10;
        /*or declare and assign  */
        int aNumber2 = 20;
        /* assign with another variable */
        int aNumber3 =aNumber1;
        System.out.println("Assigned with += " + (aNumber1+=10));
        aNumber2 -= 30; // same as aNumber2 = aNumber2 - 30;
        System.out.println("Assigned with -= " + aNumber2);

        /* Relational operators*/
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber1 equals to rNumber2? " + (rNumber1 == rNumber2));
        System.out.println("rNumber1 greater than rNumber2? " + (rNumber1> rNumber2));
        System.out.println("rNumber1 lesstham or equal to rNumber2? " + (rNumber1<rNumber2));
        System.out.println("rNumber1 not equals to rNumber2? " + (rNumber1!=rNumber2));
        /*logical opertors */
        int lNumber1 =  10, lNumber2 = 12;;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean lExpression2 = lNumber1 == lNumber2;
        System.out.println("And operators uses && " + (lExpression1 && lExpression2));
        System.out.println("or operators uses || " + (lExpression1 || lExpression2));
        System.out.println("Not operators uses ! " + !lExpression1);

        /* unary operators */
        int uNumber1 = 10;
        uNumber1++; // meaning uNumber1 = uNumber1 + 1;
        System.out.println("unary for increment is ++ " + uNumber1);
        uNumber1--;
        System.out.println("unary for decrement is -- " + uNumber1);

        /*ternary operators */
        int  tNumber1 = 10, tNumber2 = 10;
        boolean tExpression = tNumber1 == tNumber2;
        /*
         * one line if else, see the given example in if else
         * string output;
         * if(tExpression == true){
         * output = "true statement";
         * }else{
         * output = "false statemnent;
         * "}
         */
        String output = tExpression ? "True statement" : "False statement";
        /*here we can assign a string out with one expression
         * if expression is true it will return the value after the "?"
         * if the expression is flase it will return the value after the ":"
        */
        int numberOutput = tNumber1 < tNumber2 ? 10 : 20;
        System.out.println(output);
        System.out.println(numberOutput);


        /*task 1
         * make a variable and check i fthe variable is equal to or greater or equal to 18
        */

        /*task 2 
         * write a program to print sinple interest from variable
         * make 3 variable for amount, time and rate and save the calculation into varaible
         * formula:
         * si = amount * time * rate/100;
        */

        /*task 3 
         * write a program tp print the area and perimetrs of rectangle
         * a = l * b
         * p = 2 (l+b)
        */

        /*task 4
         * Complete the task 1 using ternary operatots
         */
         
         int aNum = 10;
         System.out.println("anum is greater or equal to 18"+ (aNum>=18));

         int amt = 1000, rate = 5, time = 2;
         float si = amt*time*rate/100;
         System.out.println("the simple imterest is "+ si);

         int len  = 10, width = 20;
         float area= len * width;
         float perimeter= 2*(len+width);
         System.out.println("the area is "+ area);
         System.out.println("the perimeter is "+ perimeter);
         
         int tNumber = 10, tNum2 = 18;
         boolean tExp= tNumber == tNum2;
         String outcome = tExp? "True statement": "False statemnet";
         System.out.println(outcome);
         






    }
}