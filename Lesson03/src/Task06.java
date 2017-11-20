import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create 2 arrays and find if they are equal to each other. "
                + "Type in the length of the first array:");
        int firstArrayValue = sc.nextInt();
        System.out.println("Type in the length of the second array:");
        boolean areEqual = true;
        int secondArrayValue = sc.nextInt();
        int firstArray[] = new int[firstArrayValue];
        int secondArray[] = new int[secondArrayValue];
        if (firstArray.length != secondArray.length) {
            System.out.println("The arrays are not equal");
        } else {
            System.out.println("Type in the values of the first array");
            for (int i = 0; i < firstArray.length; i++) {
                System.out.println("Type in the " + (firstArray.length - (i)) +
                        " remaining value(s) of the first array");
                firstArray[i] = sc.nextInt();
            }
            System.out.println("Type in the values of the second array");

            for (int i = 0; i < secondArray.length; i++) {
                System.out.println(
                        "Type in the " + (secondArray.length - (i)) + " remaining value(s) of the second array");
                secondArray[i] = sc.nextInt();
            }
            for (int i = 0; i < secondArray.length; i++) {
                if (secondArray[i] != firstArray[i]) {
                    areEqual = false;
                    break;
                }
            }
            if (areEqual) {
                System.out.println("The arrays are equal");
            }
            else {
                System.out.println("The arrays are not equal");
            }
        }
    }
}
