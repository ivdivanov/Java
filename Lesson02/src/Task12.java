public class Task12 {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if ((i % 10 == (i / 10) % 10) || (i % 10 == (i / 100) % 10) || (i / 10) % 10 == (i / 100) % 10) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
