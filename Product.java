import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st number: "); 
		int x = input.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int y = input.nextInt();
		
		System.out.print("Enter 3rd Number; ");
		int z = input.nextInt();
		
		int result = x * y * z;
		
		System.out.printf("Product is %d%n", result);
	}
}
