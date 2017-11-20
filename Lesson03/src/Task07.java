import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the length of your array: ");

        int arrayLength = sc.nextInt();
        int array[] = new int[arrayLength];
        int secondArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please type in the value of each of the varriables in your array:");
            array[i] = sc.nextInt();
        }
        secondArray[0] = array[0];
        secondArray[secondArray.length - 1] = array[array.length - 1];
        for (int i = 1; i < secondArray.length - 1; i++) {
            secondArray[i] = array[i - 1] + array[i + 1];
        }
        System.out.println("The values of the second arrays are: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
