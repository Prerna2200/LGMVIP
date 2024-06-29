
    import java.util.Scanner;

public class ScientificCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1, operand2;
        int choice;
        
        do {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (√)");
            System.out.println("6. Power (x^y)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    operand1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    operand2 = scanner.nextDouble();
                    System.out.println("Result: " + (operand1 + operand2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    operand1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    operand2 = scanner.nextDouble();
                    System.out.println("Result: " + (operand1 - operand2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    operand1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    operand2 = scanner.nextDouble();
                    System.out.println("Result: " + (operand1 * operand2));
                    break;
                case 4:
                    System.out.print("Enter dividend: ");
                    operand1 = scanner.nextDouble();
                    System.out.print("Enter divisor: ");
                    operand2 = scanner.nextDouble();
                    if (operand2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (operand1 / operand2));
                    }
                    break;
                case 5:
                    System.out.print("Enter number to find square root: ");
                    operand1 = scanner.nextDouble();
                    if (operand1 < 0) {
                        System.out.println("Error! Square root of a negative number is not real.");
                    } else {
                        System.out.println("Result: " + Math.sqrt(operand1));
                    }
                    break;
                case 6:
                    System.out.print("Enter base (x): ");
                    operand1 = scanner.nextDouble();
                    System.out.print("Enter exponent (y): ");
                    operand2 = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(operand1, operand2));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
            
            System.out.println(); 
            
        } while (choice != 0);
        
        scanner.close();
    }
}

