import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        System.out.println("Enter array's length");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        int[] array = new int[data];
        int[] reverseArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter cells value");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[array.length - 1 - i] = array[i];
        }
        System.out.println("reversing data");
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i] + " ");
        }
    }
}
