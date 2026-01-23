import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 9, 8, 1, 2, 5};

        System.out.println("original: " + Arrays.toString(array));

        int[] sorted = insertionSort(array);

        System.out.println("sorted: " + Arrays.toString(sorted));
    }

    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];

                j--;
            }

            array[j + 1] = value;
        }

        return array;
    }
}