import java.util.Scanner;

public class Task06 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number");
        int firstNumber = sc.nextInt();
        System.out.println("Type in a second number");
        int secondNumber = sc.nextInt();
        System.out.println("Type in a third number");
        int thirdNumber = sc.nextInt();

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = temp;

        System.out.println("First number value is: " + firstNumber + "\n"
                            + "Second number value is: " + secondNumber + "\n"
                            + "Third number value is: " + thirdNumber + "\n");

    }
}
