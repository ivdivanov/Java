import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int i = 1;
        int result = 1;

        do {
            result = i*result;
            i++;

        } while(i <= number);
        System.out.println(result);
    }
}
