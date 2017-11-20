import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        System.out.println("Enter array's length");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        int[] array = new int[data];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter cells value");
            array[i] = sc.nextInt();
        }
        int maxCounter = 0;
        int currCounter = 1;
        int number = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                currCounter++;
                if (currCounter > maxCounter) {
                    maxCounter = currCounter;
                    number = array[i];
                }
            } else if (array[i] != array[i + 1]) {
                currCounter = 1;
            }
        }
        for (int i = 0; i < maxCounter; i++) {
            System.out.print(number + " ");
        }
    }
}
