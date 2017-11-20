import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        System.out.println("Enter a number between 10...99");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = 0;
        do {
            temp = number;
            if(temp % 2 == 0){
                number *= 0.5;
            }
            else if (temp % 2 != 0) {
                number = temp * 3 + 1;
            }
            System.out.print(number + " ");
        }while (number != 1);

    }
}
