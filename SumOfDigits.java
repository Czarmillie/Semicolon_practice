import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Invalid input! Please enter an integer between 0 and 1000.");

            input.close();
            return;
        }

        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits in " + originalNumber + " is: " + sum);

        input.close();
    }
}
