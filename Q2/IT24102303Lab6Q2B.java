import java.util.Scanner;

public class IT24102303Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Please Enter 10 numbers:");

        System.out.print("Enter numbers 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter numbers 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter numbers 3: ");
        int number3= scanner.nextInt();
        System.out.print("Enter numbers 4: ");
        int number4 = scanner.nextInt();
        System.out.print("Enter numbers 5: ");
        int number5 = scanner.nextInt();
        System.out.print("Enter numbers 6: ");
        int number6 = scanner.nextInt();
        System.out.print("Enter numbers 7: ");
        int number7 = scanner.nextInt();
        System.out.print("Enter numbers 8: ");
        int number8 = scanner.nextInt();
        System.out.print("Enter numbers 9: ");
        int number9 = scanner.nextInt();
        System.out.print("Enter numbers 10: ");
        int number10= scanner.nextInt();   

        System.out.println("The numbers you enterd are: ");
        System.err.print(number1 + " "+ number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7 + " " + number8 + " "+ number9 + " " + number10);
        
     }
}
