import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Find out if the array is mirrored. Type in the length of the array: ");
        int arrayLength = sc.nextInt();
        int array[] = new int[arrayLength];
        boolean isMirrored = true;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please type in the value of each of the varriables in your array:");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < (array.length - 1) / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isMirrored = false;
            }
        }
        if (isMirrored) {
            System.out.println("The array is mirrored");
        }
        else {
            System.out.println("The array is not mirrored");
        }
    }
}
