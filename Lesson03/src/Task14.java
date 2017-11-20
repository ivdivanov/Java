import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the length of your array");
        int data = sc.nextInt();
        int counter = 0;
        int index = 0;
        double[] array = new double[data];
        double[] secondArray;
        System.out.println("Type in the values of an array");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Type in the value of the " + (i + 1) + " cell");
            array[i] = sc.nextDouble();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 3 && array[i] > -3) {
                counter++;
            }
        }
        secondArray = new double[counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 3 && array[i] > -3) {
                secondArray[index] = array[i];
                index++;
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
