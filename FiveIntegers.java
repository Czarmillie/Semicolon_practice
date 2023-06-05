import java.util.Scanner;

public class FiveIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
         System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
         System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
         System.out.print("Enter the fourth integer: ");
        int num4 = scanner.nextInt();
        
         System.out.print("Enter the fifth integer: ");
        int num5 = scanner.nextInt();
        
        int Largest;
        Largest = num1;
        if (num2 > num1){
           Largest = num2;
        }
        
        if (num3 > num2){
           Largest = num3;
        }
        
        if (num4 > num3){
           Largest = num4;
        }
        
        if (num5 > num4){
           Largest = num5;
        }
           
          System.out.printf("Largest number %d%n", Largest);
          
          int Smallest;
        Smallest = num1;
        if (num2 < num1){
           Smallest = num2;
        }
        
        if (num3 < num2){
           Smallest = num3;
        }
        
        if (num4 < num3){
           Smallest = num4;
        }
        
        if (num5 < num4){
           Smallest = num5;
           
          System.out.printf("Smallest number %d%n", Smallest);

        }
        
     }
}
