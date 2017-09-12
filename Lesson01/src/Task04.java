import java.util.Scanner;

public class Task04 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number");
        int firstNumber = sc.nextInt();
        System.out.println("Type in a second number");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The numbers in ascending order " + secondNumber + " " + firstNumber);
        }else {
            System.out.println("The numbers in ascending order " + firstNumber + " " + secondNumber);
        }
    }
}
