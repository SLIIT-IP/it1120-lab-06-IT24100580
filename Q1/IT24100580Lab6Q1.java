import java.util.Scanner;
public class IT24100580Lab6Q1 {
  public static void main(String[] args){
     Scanner scanner= new Scanner(System.in);

     System.out.print("Enter a number:");
     double number = scanner.nextDouble();
      
     double square = number * number ;
     double squareRoot= Math.sqrt(number);
      
     System.out.println("The square of "+number +"is:"+ square);
     System.out.println("the square root of " + number + "is:" + squareRoot);
  
     scanner.close();

  }

}

