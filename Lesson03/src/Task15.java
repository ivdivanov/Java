import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the length of your array");
        int data = sc.nextInt();
        double[] array = new double[data];
        System.out.println("Type in the values of an array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Type in the value of the " + (i + 1) + " cell");
            array[i] = sc.nextDouble();
        }
        double max1 = 0;
        double max2 = 0;
        double max3 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] *= -1;
            }
            if (array[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2) {
                max3 = max2;
                max2 = array[i];
            } else if (array[i] > max3) {
                max3 = array[i];
            }
        }
        System.out.println("The three numbers that make the max sum are");
        System.out.println(max1 + " " + max2 + " " + max3);
    }
}
