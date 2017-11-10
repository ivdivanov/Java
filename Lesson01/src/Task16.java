import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        System.out.println("Please enter a 3 digit number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int digitOne = number % 10;

        int digitTwo = (number / 10) % 10;

        int digitThree = (number / 100) % 10;

        if(digitOne == digitTwo && digitTwo == digitThree){
            System.out.println("The digits are even");
        }
        else if(digitOne > digitTwo && digitTwo > digitThree){
            System.out.println("The digits are in ascending order");
        }
        else if(digitOne < digitTwo && digitTwo < digitThree){
            System.out.println("The digits are in a descending order");
        }
        else {
            System.out.println("The digits are in a random order");
        }
    }
}
