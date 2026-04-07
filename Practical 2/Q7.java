public class Q7 {
    public static void main(String[] args) {
        try {
          int x = Integer.parseInt(args[0]);
          String choice = args[1];  
          int y = Integer.parseInt(args[2]);
            
          if (args.length < 3) {
                System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            }

        double result=0;

        switch (choice) {
            case "+" :
                result = x+y;
                break;
            case "-" :
                result = x-y;
                break;
            case "@" :
                result = x*y;
                break;
            case "/" :
                result = x/y;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator! Use only: +, -, *, /");
        }
            System.out.println("Num1     : " + x);
            System.out.println("Num2     : " + y);
            System.out.println("Operator : " + choice);
            System.out.println("Result   : " + result);

        } 

        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }    
}
