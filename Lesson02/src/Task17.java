import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        System.out.println("Please enter a number bewtween 3 and 20");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        System.out.println("Please enter a char");
        char a = sc.next().charAt(0);

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m)
                    System.out.print("*");
                else if (j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(a);
            }
            System.out.println();
        }
    }
}
