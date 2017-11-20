import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the number of lines for your triangle");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int spaces = 1; spaces <= rows - i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * i - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }
}
