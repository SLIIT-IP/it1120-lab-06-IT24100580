 import java.util.Scanner;

public class IT24100580Lab6Q2B {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int count = 1;

        
        int[] numbers = new int[10];

        
        while (count <= 10) {
            
            System.out.print("Enter number " + count + ": ");
            
            
            numbers[count - 1] = scanner.nextInt();

           
            count++;
        }

       
        System.out.println("You entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        
        System.out.println();
        
        
        scanner.close();
    }
}