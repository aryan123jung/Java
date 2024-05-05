public class FunctionClass {
    /*write a function insde a class */
    void printSomething(){
        System.out.println("This function prints");
    }
    /*In the function void means nothing/null */

    /*With return type as int */
    int returnInteger(){
        int returnThis = 1;
        return returnThis;
    }
    /*with return and params */
    boolean returnString(int num1,int num2){
        boolean check = num1 == num2;
        return check;
    }
    public static void main(String[] args) {
        /*to use a function you need to make object */

        /*Note: JUST REMEMBER THE SYNTAX FOR NOW */

        FunctionClass fc = new FunctionClass();
        fc.printSomething();

        /*You can call this function anytime in need */
        fc.printSomething();

        /*If a function has a return type order than void we can save it */
        int callIntFunction = fc.returnInteger();
        boolean callReturnString = fc.returnString(10,20);
        System.out.println("Function with return Int" + callIntFunction);
    }
}
