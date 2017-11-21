import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = {
                {11, 12, 13, 14, 15, 16 },
                { 21, 22, 23, 24, 25, 26 },
                { 31, 32, 33, 34, 35, 36 },
                { 41, 42, 43, 44, 45, 46 },
                { 51, 52, 53, 54, 55, 56 },
                { 61, 62, 63, 64, 65, 66 }
        };// new int[6][6];
        int rowSum = 0;
        int totalSum = 0;
/*		System.out.println("Enter array cells");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Enter a cell");
				array[i][j] = sc.nextInt();
			}
		}*/
        for (int i = 0; i < array.length; i++) {
            rowSum = 0;
            for (int j = 0; j < array.length; j++) {
                if (i % 2 != 0) {
                    System.out.print(array[i][j] + ",");
                    totalSum += array[i][j];
                    rowSum += array[i][j];
                }
            }
            if (i % 2 != 0) {
                System.out.println("Current row sum " + rowSum);
            }
        }
        System.out.println("The sum of all elements is " + totalSum);
    }
}
