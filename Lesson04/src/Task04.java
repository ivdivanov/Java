import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of your matrix");
        int rows = sc.nextInt();
        System.out.println("Now enter the number of columns");
        int cols = sc.nextInt();
        int[][] array =
                {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                };//new int[rows][cols];

/*		System.out.println("Enter the matrix cells");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Enter a cell");
				array[i][j] = sc.nextInt();
			}
		}*/
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = array[i].length-1; j >= 0; j--) {
                System.out.print(array[j][i] + " ");
            }
        }
        System.out.println();
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + " ");
            }
        }
    }
}
