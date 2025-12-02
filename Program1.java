import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        double result = Calculator.calculate(a, b, op);

        System.out.println("Result = " + result);
    }
}

class Calculator{
    static double calculate(double a, double b, String op) {
        return switch (op.toLowerCase()) {
            case "add", "+" -> a + b;
            case "subtract", "-" -> a - b;
            case "multiply", "*" -> a * b;
            case "divide", "/" -> {
                if (b == 0) {
                    System.out.println("Invalid Operand!");
                }
                yield a / b;
            }
            default -> {
                System.out.println("Invalid Operation!");
                yield 0;
            }
        };
    }
}

