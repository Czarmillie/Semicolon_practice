import java.util.Scanner;

public class TwoIntegersOne {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int num1 = input.nextInt();
	
	System.out.print("Enter second number: ");
	int num2 = input.nextInt();
	
	int Sum = num1 + num2;
	int Square = num1 * num2;
	int Division = num1 / num2;
	
	System.out.printf("The Sum: %d%n The Square: %d%n Division: %d%n" , Sum, Square, Division );
	}
}
