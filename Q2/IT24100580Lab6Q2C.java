import java.util.Scanner;

public class IT24100580Lab6Q2C {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        int count = 1;

       
        int[] numbers = new int[10];

        
        int sum = 0;

        
       while (count <= 10) {
        
            System.out.print("Enter number " + count + ": ");
            
        
            numbers[count - 1] = scanner.nextInt();

       
            sum += numbers[count - 1];

            
            count++;
        }

             double average = (double) sum / numbers.length;
        
        System.out.println("You entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        
        
        scanner.close();
    }
}