import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number between 100 and 999. Make sure that there aren't any zeroes.");
        int number = sc.nextInt();

        int firstNumber = number % 10;
        int secondNumber = (number / 10) % 10;
        int thirdNumber = number / 100;

        if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0) {
            System.out.println("The number contains zeroes");
        }
        else {
            if (number % thirdNumber == 0 && number % secondNumber == 0 && number % firstNumber == 0) {
                System.out.println("The number can be divided to each of its digits");
            }
            else {
                System.out.println("The number cannot be divided to each of its digits");
            }
        }
    }
}
