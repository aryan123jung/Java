public class task1 {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Usage: java task1 <num1> <num2> <num3>");
            return;
        }
        
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);
        
        double max = findMax(num1, num2, num3);
        
        System.out.println("The maximum number is: " + max);
    }
    
    public static double findMax(double num1, double num2, double num3) {
        double max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }
}
