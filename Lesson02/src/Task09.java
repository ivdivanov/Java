import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in your first number");
        int firstNumber = sc.nextInt();
        System.out.println("Type in your second number");

        int secondNumber = sc.nextInt();
        int sum = 0;
        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 3 == 0) {
                continue;
            }else if (sum > 200) {
                System.out.println("The sum is over 200 - " + sum );
                break;
            }
            sum += (i * i);
            System.out.print((i * i) + ", ");
        }
    }
}
