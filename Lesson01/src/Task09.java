import java.util.Scanner;

public class Task09 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number between 10 and 99");
        int firstNumber = sc.nextInt();
        System.out.println("Type in a second number between 10 and 99");
        int secondNumber = sc.nextInt();

        int calculateNumbers = firstNumber * secondNumber;
        int lastDigit = calculateNumbers % 10;

        if (lastDigit % 2 == 0) {
            System.out.println(calculateNumbers + ", " + lastDigit + " The last number is even");
        }
        else{
            System.out.println(calculateNumbers + ", " + lastDigit + " The last number is not even");
        }


    }
}
