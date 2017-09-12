import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number");
        int firstNumber = sc.nextInt();
        System.out.println("Type in a second number");
        int secondNumber = sc.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / "  + secondNumber + " = " + (firstNumber / secondNumber));

        System.out.println("Type in a number");
        double thirdNumber = sc.nextDouble();
        System.out.println("Type in a second number");
        double forthNumber = sc.nextDouble();

        System.out.println(thirdNumber + " + " + forthNumber + " = " + (thirdNumber + forthNumber));
        System.out.println(thirdNumber + " - " + forthNumber + " = " + (thirdNumber - forthNumber));
        System.out.println(thirdNumber + " x " + forthNumber + " = " + (thirdNumber * forthNumber));
        System.out.println(thirdNumber + " / "  + forthNumber + " = " + (thirdNumber / forthNumber));

    }
}
