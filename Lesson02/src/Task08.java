import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // number equal to number of lines

        for (int i = 1; i <= number; i++) {
            System.out.println();
            for (int j = 1; j <= number; j++) {
                System.out.print((number - 1) +  2*(i - 1));
            }

        }
    }
}
