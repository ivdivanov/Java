import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a number and get the sum of every number between one and the number that" +
                "you have typed in. \nType in your number:");

        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The result is: " + sum);

    }
}
