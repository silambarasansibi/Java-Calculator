import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        
        System.out.println("Enter first number:");
        num1 = sc.nextDouble();
        
        System.out.println("Enter operator (+, -, *, /):");
        operator = sc.next().charAt(0);
        
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
