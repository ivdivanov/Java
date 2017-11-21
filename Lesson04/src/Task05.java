import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your matrix");
        int maxRow = 0;
        int maxCol = 0;
        int data = sc.nextInt();
        int[][] array = 				{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };//new int[data][data];

/*		System.out.println("Enter array cells");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Enter a cell");
				array[i][j] = sc.nextInt();
			}
		}*/
        for (int i = 0; i < array.length; i++) {
            int currentRowSum = 0;
            int currentColSum = 0;
            for (int j = 0; j < array.length; j++) {
                currentRowSum += array[i][j];
                currentColSum += array[j][i];
            }
            if (currentRowSum > maxRow) {
                maxRow = currentRowSum;
            }
            if (currentColSum > maxCol) {
                maxCol = currentColSum;
            }
        }
        System.out.println("The max sum of all rows is " + maxRow);
        System.out.println("The max sum of all cols is " + maxCol);

        if (maxRow > maxCol) {
            System.out.println("The max sum of the rows is larger than the max sum of the cols");
        }
        else if (maxRow < maxCol) {
            System.out.println("The max sum of the cols is larger than the max sum of the rows");
        }
        else {
            System.out.println("The max sum of the cols is equal to the max sum of the rows");
        }
    }
}
