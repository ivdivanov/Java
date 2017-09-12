import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in two numbers to exchange their values. Type in the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Type in the second number");
        int secondNumber = sc.nextInt();

        // 1. First Option
//        firstNumber = firstNumber + secondNumber;
//        secondNumber = firstNumber - secondNumber;
//        firstNumber = firstNumber - secondNumber;

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("First number value: " + firstNumber);
        System.out.println("Second number value: " + secondNumber);
    }
}
