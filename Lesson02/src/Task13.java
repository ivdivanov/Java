import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 2 and 27");
        int number = sc.nextInt();
        if (number < 2) {
            number = 2;
        }else if (number > 27) {
            number = 27;
        }
        for (int i = 100; i <= 999; i++) {
            if ((i % 10) + ((i / 10) % 10) + ((i / 100) % 10) == number) {

                System.out.print(i + " ");
            }
        }
    }
}
