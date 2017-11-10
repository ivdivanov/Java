import javax.swing.*;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number between 10 and 9999");
        int water = sc.nextInt();

        int combinedTurns = water / 5;
        int extraBuckets = water % 5;

        if (extraBuckets == 0 || extraBuckets == 1) {
            System.out.println(combinedTurns + " times of 3 liter bucket"
                    + (combinedTurns) + " times of 2 liter bucket and no extra bucket is needed");
        }
        else if (extraBuckets == 2) {
            System.out.println(combinedTurns + " times of 3 liter bucket"
                    + (combinedTurns) + " times of 2 liter bucket and one 1 extra 2 liter bucket is needed");
        }
        else {
            System.out.println(combinedTurns + " times of 3 liter bucket"
                    + (combinedTurns) + " times of 2 liter bucket and one 1 extra 3 liter bucket is needed");
        }
    }

}
