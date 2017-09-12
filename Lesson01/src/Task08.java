import java.util.Scanner;

public class Task08 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number between 1000 and 9999");
        int number = sc.nextInt();

        if (number < 1000) {
            number = 1000;
        }else if (number > 9999) {
            number = 9999;
        }

        int firstNumber = ((number / 1000) * 10) + number % 10;
        int secondNumber = (((number / 100) % 10) * 10) + ((number / 10) % 10);

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " > " + secondNumber);
        }else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " < " + secondNumber);
        }else {
            System.out.println(firstNumber + " = " + secondNumber);
        }
    }
}
