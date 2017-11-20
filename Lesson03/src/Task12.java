public class Task12 {

    public static void main(String[] args) {
        int[] array = new int[7];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        array[2] = array[2] + array[3];
        array[3] = array[2] - array[3];
        array[2] = array[2] - array[3];

        array[4] = array[4] * array[5];
        array[5] = array[4] / array[5];
        array[4] = array[4] / array[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
