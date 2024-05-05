public class variable{
    /*Instance  variable
     * Will need object  to acess the variable
     * Not shared between the object
     */
    int instanceVariable = 100;
    /*Statice/class variable
     * No need of object, can  be called from class
     * Shared  between the objects
     */
    Static int StaticVariable = 20;
  
      public static void main(string[] args){
          /* Non primitive data type */
          /*Declaration */
          byte byteValue;
          /*Initiliation */
          byteValue = 100;
          /* Declarataion and initialization */
          short shortValue = 200;
          /* Multiple declaration */
          int intValue1, intValue2;
          intValue1 = 10000;
          intValue2 = 2000;
          /* multipe declation and initiztion */
          long longVal1 = -9000, longVal2 = 9000;
          float floatValue = 90.90f; // the letter 'f' is needed
          double doubleValue = 100.897d; // the letter 'd' is optional
          char  charValue = 'c'; // must use single quote  '
          boolean  booleanValue= false;
          /*Illegal  actions below */
          //byte  bytevalue =  100; // we cannot redeclare  the variable
          //bytevalue = 200; // instead use reassignment
          // boooolean bolvar2 = 'false'; // cannot use different type
          // byte byteValue2 = 10000000; // cannot exceed min amd max
  
          /* Non primitive data type */
          String StringValue  = "This  is String value";
          /*Using class */
          String StringValue2 = new String("This String uses class");
          System.out.println(StringValue2);
          /*object for this we can use the same public class  made */
          Variable VariableObject = new variable();
          /*Use object from above to acess  instance variable */
          System.out.println(VariableObject.instanceVariable);
          /*Use class to use static variable */
          System.out.println(Variable.StaticVariable);
  
          /*Type casting */
          int intValueType = 100;
          double = intValueType;
          /*Automatically cast from low datatype to high datatype */
  
          /*Explicit casting */
          double = 190.8109;
          int = (int) doubleValue;
          /*Manually specify data type for eg. (int) */
          /*Note this type cast can only be done in primitive data type */
  
  
  
          /*task
           * Make one double variable called doubleVar1 = 1000.12
           * Explicitly cast the variable  into float, floatvar1
           * Explicitly cast the floatvar1 into int, intvar1
           * Make a string  variable with the "The  interger  is"
           * Print the string variable and print the int variable in another         */
  
  
           double doublevar1= 1000.12;
           float floatvar1 =(float) doublevar1;
  
           int  intvar1 = (int) floatvar1;
  
          
  
          /String Stringvar1 = new String("The integer is");/ /* */
          
           System.out.println(Stringvar1);
           System.out.println(intvar1)
        }
  }