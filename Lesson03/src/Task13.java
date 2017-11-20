import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a number: ");
        int number = sc.nextInt();
        int binary = number;
        int counter = 0;
        int binaryArray[];
        while(binary > 0){
            binary /= 2;
            counter++;
        }
        binaryArray = new int[counter];
        for (int i = 0; i < binaryArray.length; i++) {
            int reminder = number % 2;
            binaryArray[binaryArray.length - i - 1] = reminder;
            number /= 2;
        }
        System.out.println("The number in binary is ");
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i]);
        }
    }
}
