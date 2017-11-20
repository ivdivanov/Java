import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Find the smallest number which can be divided by 3. \n" +
                "Type in the length of your array: ");
        int arrayLength = sc.nextInt();
        int array[] = new int[arrayLength];
        int smallestValue = -1; // the value is set to -1, because on the last "if" can find that it can be divided by 0 (because 0 % 0 is 0)
        int dividable = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please type in the value of each of the varriables in your array:");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                dividable = array[i];
                if (smallestValue == -1) {
                    smallestValue = dividable;
                }else if (dividable < smallestValue) {
                    smallestValue = dividable;
                }
            }
        }
        if (smallestValue % 3 == 0) {
            System.out.println("The smallest value that can be divided by 3 in the array was: " + smallestValue);
        }else {
            System.out.println("None of the number was dividable");
        }
    }
}
