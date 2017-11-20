import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the sum of number between 1 and the number that you have typed in:");
        int number = sc.nextInt();
        if (number < 1) {
            number = 1;
        }
        int result = 0;
        int startNumber = 1;
        do {
            result += startNumber;
            startNumber++;
        } while (startNumber <= number);

        System.out.println(result);

    }
}
