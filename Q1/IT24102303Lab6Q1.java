import java.util.Scanner;

public class IT24102303Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        double square = number * number;
        double squareRoot = Math.sqrt(number);
        
        System.out.println("The Square of 25.0 is : " + square);
        System.out.println("The Square Root of 25.0  is : " + squareRoot);
    }
}
