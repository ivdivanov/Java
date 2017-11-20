import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        System.out.println("Enter a number [1..51]");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n-1; i < 52; i++){
            int currentType = (int)Math.floor(i / 4);
            int currentPaint = i % 4;

            switch(currentType){
                case 0: System.out.print("2"); break;
                case 1: System.out.print("3"); break;
                case 2: System.out.print("4"); break;
                case 3: System.out.print("5"); break;
                case 4: System.out.print("6"); break;
                case 5: System.out.print("7"); break;
                case 6: System.out.print("8"); break;
                case 7: System.out.print("9"); break;
                case 8: System.out.print("10"); break;
                case 9: System.out.print("Вале"); break;
                case 10: System.out.print("Дама"); break;
                case 11: System.out.print("Поп"); break;
                case 12: System.out.print("Асо"); break;
            }
            switch(currentPaint){
                case 0: System.out.print(" спатия"); break;
                case 1: System.out.print(" каро"); break;
                case 2: System.out.print(" купа"); break;
                case 3: System.out.print(" пика"); break;
            }
            System.out.println();
        }
    }
}
