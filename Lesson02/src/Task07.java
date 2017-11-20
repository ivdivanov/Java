import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Staring from 3, receive the numbers that can be divided by 3" +
                " according to the number you have typed in: ");
        int number = sc.nextInt();
        int dividableNumbers = 0;
        int counter = 1;

        while (counter <= number) {
            if (counter == number) {
                dividableNumbers += 3;
                System.out.print(dividableNumbers);
                counter++;
            }else {
                dividableNumbers += 3;
                System.out.print(dividableNumbers + ", ");
                counter++;
            }
        }
    }
}
