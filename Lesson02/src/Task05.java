import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in two numbers and receive all of the numbers from the lesser to the greater one."
                + " Type in the first one:");

        int firstNumber = sc.nextInt();

        System.out.println("Type in the second number:");

        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {

            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;

        }

        for (int i = firstNumber; i <= secondNumber; i++) {

            System.out.print(i + " ");

        }
    }
}

