import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        System.out.println("Please enter a number between 10 and 200");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 10) {
            number = 10;
        }
        else if (number > 200) {
            number = 200;
        }
        for (int i = number; i >= 10; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
