import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int sum = 0;
        int averegeNumber = 0;
        int closestNumber = 0;
        int tempSum;

        System.out.println("Type 7 values of an array");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Type in the value of the " + (i + 1) + " cell");
            array[i] = sc.nextInt();
            sum += array[i];
        }
        averegeNumber = sum / array.length;
        closestNumber = sum;
        tempSum = sum;
        System.out.println(averegeNumber);

        for (int i = 0; i < array.length; i++) {
            int tempResult = averegeNumber - array[i];
            if (tempResult < 0) {
                tempResult = (tempResult * -1);
            }
            if (tempResult < tempSum) {
                tempSum = tempResult;
                closestNumber = array[i];
            }
        }
        System.out.println("The avarage number is " + averegeNumber + " and the closest number among the array is "
                + closestNumber);
    }
}
