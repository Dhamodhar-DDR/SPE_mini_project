package Calculator;
import java.util.Scanner;

public class Calculator {
    public double square_root(double a){
        if(a<0) return 0;
        return Math.sqrt(a);
    }
    public double factorial(double a){
        if(a <= 0) return 0;
        else{
            double ans = 1;
            for(int i = 1; i <= a; i++)
            {
                ans = ans * i;
            }
            return ans;
        }
    }
    public double logarithm(double a){
        if(a == 0) return 0;
        return Math.log(a);
    }
    public double power(double a, double b){
        if(a == 0 & b == 0) return 0;
        return Math.pow(a, b);
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        double inp1, inp2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("################ Scientific Calculator ################");
        System.out.print(" 1. Find square root of a number\n 2. Find factorial of a number\n 3. Find Natural logarithm of a number\n 4. Find power of a raised to b\n" + "Enter any integer corresponding to the calculation to perform: ");

        while(true) {
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
