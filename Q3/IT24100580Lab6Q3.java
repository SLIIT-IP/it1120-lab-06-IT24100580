import java.util.Scanner;

public class IT24100580Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sumOfSquares = 0.0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == -99) {
                break;
            } else if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
                continue;
            }

            sumOfSquares += num * num;
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }
    }
}