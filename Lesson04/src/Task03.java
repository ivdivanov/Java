import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of your matrix");
        int rows = sc.nextInt();
        System.out.println("Now enter the number of columns");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        int sumOfElements = 0;
        int average = 0;
        int counter = 0;

        System.out.println("Enter the matrix cells");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter a cell");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumOfElements += array[i][j];
                counter++;
            }
        }
        average = sumOfElements / counter;
        System.out.println("The sum of all of the elements in the matrix is: " +
                sumOfElements + " and the average sum is " + average);
    }
}
