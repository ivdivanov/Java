import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a number");

        int number = sc.nextInt();
        int array[] = new int[10];

        array[0] = number;
        array[1] = number;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
