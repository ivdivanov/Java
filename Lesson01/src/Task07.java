import java.util.Scanner;

public class Task07 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a hour of the day between 1 and 24");
        int hour = sc.nextInt();
        System.out.println("Type in the amount of money that you have");
        double money = sc.nextDouble();
        System.out.println("Are you sick? - true or false");
        boolean isSick = sc.nextBoolean();

        if (isSick) {
            System.out.println("I'm sick. I won't be going out.");
            if (money > 0) {
                System.out.println("I'm going to buy some medicine.");
            }else {
                System.out.println("I'll just be drinking tea at home.");
            }
        }else if (isSick == false) {
            System.out.println("I'm planing to go out with some friends.");
            if (money < 10) {
                System.out.println("We'll probably go to drink some coffee.");
            }else{
                System.out.println("We'll go to catch a movie.");
            }
        }


    }
}
