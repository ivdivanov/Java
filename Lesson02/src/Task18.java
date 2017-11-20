import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        System.out.println("Enter numbers from 1 to 9");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=b;j++){
                System.out.println(i + "*" + j + " = " + (i * j));
            }
        }
    }
}

