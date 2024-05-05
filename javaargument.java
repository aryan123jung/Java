public class javaargument {

    public static void main(String[] args) {
        if(args.length > 2){
            System.out.println("Not enough args");
            return;
        }
        System.out.println("First arg is " + args[0]);
        System.out.println("second arg is " + args[1]);
        // converts strings into integer/ must pass number in 2nd args
        int argInt = Integer.parseInt(args[1]);

    }
    
}
