import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 9, 8, 1, 2, 5};

        System.out.println("original: " + Arrays.toString(array));

        int[] sorted = bubbleSort(array);

        System.out.println("sorted: " + Arrays.toString(sorted));
    }

    private static int[] bubbleSort(int[] array) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }
        }
        return array;
    }
}