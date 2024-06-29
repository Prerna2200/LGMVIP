
     
     import java.util.Scanner;

     public class Currency {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
     
             System.out.println("Currency Converter");
             System.out.println("1. USD to INR");
             System.out.println("2. INR to USD");
             System.out.println("3. USD to EUR");
             System.out.println("4. EUR to USD");
             System.out.println("5. USD to JPY");
             System.out.println("6. JPY to USD");
     
             System.out.print("Enter your choice: ");
             int choice = scanner.nextInt();
     
             System.out.print("Enter the amount: ");
             double amount = scanner.nextDouble();
     
             double result = 0;
     
             switch (choice) {
                 case 1:
                     result = amount * 74.83; // 1 USD = 74.83 INR
                     System.out.println(amount + " USD = " + result + " INR");
                     break;
                 case 2:
                     result = amount / 74.83; // 1 INR = 0.0134 USD
                     System.out.println(amount + " INR = " + result + " USD");
                     break;
                 case 3:
                     result = amount * 0.84; // 1 USD = 0.84 EUR
                     System.out.println(amount + " USD = " + result + " EUR");
                     break;
                 case 4:
                     result = amount / 0.84; // 1 EUR = 1.19 USD
                     System.out.println(amount + " EUR = " + result + " USD");
                     break;
                 case 5:
                     result = amount * 109.27; // 1 USD = 109.27 JPY
                     System.out.println(amount + " USD = " + result + " JPY");
                     break;
                 case 6:
                     result = amount / 109.27; // 1 JPY = 0.0092 USD
                     System.out.println(amount + " JPY = " + result + " USD");
                     break;
                 default:
                     System.out.println("Invalid choice");
             }
         }
     
        }