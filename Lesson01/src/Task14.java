import java.util.Scanner;

public class Task14 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the coordinates for the first position between 1 and 8");
        int firstPositionCoordOne = sc.nextInt();
        int firstPositionCoordTwo = sc.nextInt();
        System.out.println("Type in the coordinates for the second position between 1 and 8");
        int secondPositionCoordOne = sc.nextInt();
        int secondPositionCoordTwo = sc.nextInt();

        if ((firstPositionCoordOne < 1 || firstPositionCoordOne > 8)
            || (firstPositionCoordTwo < 1 || firstPositionCoordTwo > 8)
            || (secondPositionCoordOne < 1 || secondPositionCoordOne > 8)
            || (secondPositionCoordTwo < 1 || secondPositionCoordTwo > 8)) {

            System.out.println("Invalid coords");

        }else {

            if(((firstPositionCoordOne + firstPositionCoordTwo) % 2 == 0
                    && (secondPositionCoordOne + secondPositionCoordTwo) % 2 == 0)
                    || ((firstPositionCoordOne + firstPositionCoordTwo) % 2 == 1
                    && (secondPositionCoordOne + secondPositionCoordTwo) % 2 == 1)) {
                System.out.println("The coordinates are the same colour");
            }
            else {
                System.out.println("The coordinates are NOT the same colour");
            }

        }


    }
}
