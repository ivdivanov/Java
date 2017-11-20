import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int[] array = new int[data];
        System.out.println("Enter the value of cells");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Type in the value of the " + (i + 1) + " cell");
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] > array[i - 1] && array[i] > array[i + 1])
                    || (array[i] < array[i - 1] && array[i] < array[i + 1])) {
                System.out.println("The array is jagged");
                break;
            } else {
                System.out.println("The array isn't jagged");
                break;
            }
        }
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] < array[i + 2]) {
                System.out.println(" and increasing");
                break;
            } else {
                System.out.println(" and not increasing");
                break;
            }
        }
    }
}
