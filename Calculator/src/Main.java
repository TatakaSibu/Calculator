import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to the world of Calculator !");

        int Operator, firstValue, secondValue;
        System.out.println("1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide");
        System.out.print("Choose Operator : ");
        Operator = x.nextInt();

        System.out.println("Enter the First Value : ");
        firstValue = x.nextInt();

        System.out.println("Enter the Second Value : ");
        secondValue = x.nextInt();

        int result = 0;
        switch (Operator){
            case 1:
                result = firstValue + secondValue;
                break;

            case 2:
                result = firstValue - secondValue;
                break;

            case 3:
                result = firstValue * secondValue;
                break;

            case 4:
                try {
                    if (secondValue == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    result = firstValue / secondValue;
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    return; // exit the program
                }
                break;

            default:
                System.out.println("Entered Operator is not valid");
        }
        System.out.println("Result is : " + result);
    }
}