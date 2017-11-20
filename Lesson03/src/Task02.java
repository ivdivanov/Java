import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the length of your array: ");
        int arrayLength = sc.nextInt();
        int array[] = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {

            System.out.println("Please type in the value of each of the varriables in your array:");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int messedUpArray[] = new int[array.length];
        for (int i = 0; i < (messedUpArray.length+1) / 2; i++) {
            messedUpArray[i] = array[i];
            messedUpArray[messedUpArray.length - 1 - i] = array[i];
        }
        for (int i = 0; i < messedUpArray.length; i++) {
            System.out.print(messedUpArray[i] + " ");
        }
    }

}
