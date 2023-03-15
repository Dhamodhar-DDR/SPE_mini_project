package Calculator;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logUtility = LogManager.getLogger(Calculator.class);
    public Double square_root(double a){
        if(a<0)
        {
            logUtility.error("Square root of negative number is not defined");
            return null;
        }
        logUtility.info("Square root of "+a+" is equal to: "+ Math.sqrt(a));
        return Math.sqrt(a);
    }
    public Integer factorial(double a){
        if(a < 0) {
            logUtility.error("Factorial of negative number is not defined");
            return null;
        }
        else{
            Integer ans = 1;
            for(int i = 1; i <= a; i++) ans = ans * i;
            logUtility.info("Factorial of "+a+" is equal to: "+ ans);
            return ans;
        }
    }
    public Double logarithm(double a){
        if(a == 0) {
            logUtility.error("Natural Logarithm of zero is not defined");
            return null;
        }
        if(a < 0) {
            logUtility.error("Natural Logarithm of negative numbers is not defined");
            return null;
        }
        logUtility.info("Natural Logarithm of "+a+" is equal to: " + Math.log(a));
        return Math.log(a);
    }
    public Double power(double a, double b){
        if(a == 0 & b == 0)
        {
            logUtility.info("0 power 0 is not defined");
            return null;
        }
        logUtility.info(a+ " power "+b+" is equal to: " + Math.pow(a, b));
        return Math.pow(a, b);
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        double inp1, inp2;
        while(true)
        {
            System.out.println("################ Scientific Calculator ################");
            System.out.println("Enter one of the following integers corresponding to the task you would like to perform");
            System.out.println("1. Find square root of a number");
            System.out.println("2. Find factorial of a number");
            System.out.println("3. Find Natural logarithm of a number");
            System.out.println("4. Find power of a raised to b");
            System.out.println("5. Enter 5 to exit");
            int base_inp;
            base_inp = scanner.nextInt();
            switch (base_inp) {
                case 1:
                    // Square root
                    System.out.print("Enter a number : ");
                    inp1 = scanner.nextDouble();
                    System.out.println("Square root of "+inp1+" is equal to: " + calculator.square_root(inp1)+ "\n");
                    break;
                case 2:
                    // Factorial
                    System.out.print("Enter a number : ");
                    inp1 = scanner.nextDouble();
                    System.out.println("Factorial of "+inp1+" is equal to: " + calculator.factorial(inp1)+ "\n");
                    break;
                case 3:
                    // Natural log
                    System.out.print("Enter a number : ");
                    inp1 = scanner.nextDouble();
                    System.out.println("Logarithm of "+inp1+" is equal to: " + calculator.logarithm(inp1)+ "\n");
                    break;
                case 4:
                    // Power
                    System.out.print("Enter the first number (a) : ");
                    inp1 = scanner.nextDouble();
                    System.out.print("Enter the second number (b): ");
                    inp2 = scanner.nextDouble();
                    System.out.println(inp1+ " power "+inp2+" is equal to: " + calculator.power(inp1, inp2) + "\n");
                    break;
                default:
                    System.out.println("Entered an unexpected input. Closing the program .....");
                    return;
            }
        }
    }
}
