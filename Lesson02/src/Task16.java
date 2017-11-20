import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers between 10 and 5555");

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int temp;
        if (firstNumber > secondNumber) {
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        for (int i = secondNumber; i >= firstNumber; i--) {
            if (i % 50 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
