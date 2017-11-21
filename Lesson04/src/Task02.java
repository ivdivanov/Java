import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your matrix");
        int data = sc.nextInt();
        int[][] array = new int[data][data];

        System.out.println("Enter array cells");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter a cell");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The values of the diagonals are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) == array.length - 1) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
