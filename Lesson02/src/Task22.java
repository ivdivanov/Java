import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in your first number");
        int number = sc.nextInt();

        int counter = 1;

        while(counter <= 10) {
            if (number % 2 == 0) {
                System.out.print(counter + ":" + number + " ");
                counter++;
            }
            else if (number % 3 == 0) {
                System.out.print(counter + ":" + number + " ");
                counter++;
            }
            else if (number % 5 == 0) {
                System.out.print(counter + ":" + number + " ");
                counter++;
            }
            number++;
        }
    }

}
