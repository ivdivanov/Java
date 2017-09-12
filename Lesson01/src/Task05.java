import java.util.Scanner;

public class Task05 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number");
        int firstNumber = sc.nextInt();
        System.out.println("Type in a second number");
        int secondNumber = sc.nextInt();
        System.out.println("Type in a third number");
        int thirdNumber = sc.nextInt();

        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            if (secondNumber <= thirdNumber) {
                System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
            }else{
                System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
            }
        }else if (firstNumber >= secondNumber && firstNumber <= thirdNumber) {
            System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
        }else if (thirdNumber <= firstNumber && thirdNumber <= secondNumber) {
            if (firstNumber >= secondNumber)
            System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
            else {
                System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
            }
        }

    }
}
