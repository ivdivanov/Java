import java.util.Scanner;

public class Task15 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type in an hour between 0 and 24");
        int hour = sc.nextInt();

        if (hour < 0) {
            hour = 0;
        }
        if (hour > 24) {
            hour = 24;
        }
        if (hour >= 18 || hour < 4) {
            System.out.println("Good Evening");
        }
        else if (hour >= 4 && hour < 9) {
            System.out.println("Good Morning");
        }
        else if (hour >= 9 && hour < 18) {
            System.out.println("Good Day");
        }
    }
}
