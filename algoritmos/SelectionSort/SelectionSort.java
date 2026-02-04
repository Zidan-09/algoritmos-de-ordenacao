import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 9, 8, 1, 2, 5};

        System.out.println("original: " + Arrays.toString(array));

        int[] sorted = selectionSort(array);

        System.out.println("sorted: " + Arrays.toString(sorted));
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minorNumberIdx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minorNumberIdx]) {
                    minorNumberIdx = j;
                }
            }

            if (minorNumberIdx != i) {
                int temp = array[minorNumberIdx];
                array[minorNumberIdx] = array[i];
                array[i] = temp;
            }
        }

        return array;
    }
}