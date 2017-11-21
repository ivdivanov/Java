import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[6][5];
        int minValue;
        int maxValue;

        System.out.println("Enter array cells");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter a cell");
                array[i][j] = sc.nextInt();
            }
        }
        minValue = array[0][0];
        maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (minValue > array[i][j]) {
                    minValue = array[i][j];
                }
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                }
            }
        }
        System.out.println("The minimum value is " + minValue + " and the maximum value is " + maxValue);
    }
}
