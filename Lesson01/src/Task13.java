import java.util.Scanner;

public class Task13 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a number between -100 and 100");
        int temperature = sc.nextInt();
        if (temperature < -100) {
            temperature = -100;
        }
        if (temperature > 100) {
            temperature = 100;
        }
        if (temperature < -20) {
            System.out.println("Freezing!");
        }
        else if (temperature >= -20 && temperature < 0 ) {
            System.out.println("Cold!");
        }
        else if (temperature >= 0 && temperature < 15) {
            System.out.println("Cool!");
        }
        else if (temperature >= 15 && temperature < 25) {
            System.out.println("Hot!");
        }
        else {
            System.out.println("Very Hot!");
        }
        
    }
}
