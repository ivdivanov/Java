import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        System.out.println("Type 7 values of an array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Type in the value of the " + (i + 1) + " cell");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] > 5) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
