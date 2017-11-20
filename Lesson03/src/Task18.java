import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the length of the first array:");
        int firstArrayValue = sc.nextInt();
        System.out.println("Type in the length of the second array:");
        int secondArrayValue = sc.nextInt();
        int firstArray[] = new int[firstArrayValue];
        int secondArray[] = new int[secondArrayValue];
        if (firstArray.length != secondArray.length) {
            System.out.println("The arrays are not equal");
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                System.out.println("Please type in the value of each of the varriables in the first array:");
                firstArray[i] = sc.nextInt();
            }
            for (int i = 0; i < secondArray.length; i++) {
                System.out.println("Please type in the value of each of the varriables in the second array:");
                secondArray[i] = sc.nextInt();
            }
            int[] thirdArray = new int[firstArray.length];
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] >= secondArray[i]) {
                    thirdArray[i] = firstArray[i];
                } else {
                    thirdArray[i] = secondArray[i];
                }
            }
            for (int i = 0; i < thirdArray.length; i++) {
                System.out.print(thirdArray[i] + " ");
            }
        }
    }
}
