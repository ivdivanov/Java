import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number");
        double firstNumber = sc.nextDouble();
        System.out.println("Type in a second number");
        double secondNumber = sc.nextDouble();
        System.out.println("Type in a third number and find out if it is between the first two");
        double thirdNumber = sc.nextDouble();

        // first option
//        if (firstNumber > secondNumber) {
//            double temp = firstNumber;
//            firstNumber = secondNumber;
//            secondNumber = temp;
//        }
//
//        if (thirdNumber > firstNumber && thirdNumber < secondNumber) {
//            System.out.println("The third number is between the first two");
//        }
//        else {
//            System.out.println("The number isn't between the first two numbers");
//        }

        if ((thirdNumber > firstNumber && thirdNumber < secondNumber)
                || (thirdNumber < firstNumber && thirdNumber > secondNumber)) {
            System.out.println("The third number is between the first two");
        }else {
            System.out.println("The number isn't between the first two numbers");
        }
    }
}
