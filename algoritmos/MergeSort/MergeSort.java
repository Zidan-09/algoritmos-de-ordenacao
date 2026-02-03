import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 9, 8, 1, 2, 5};

        System.out.println("original: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("sorted: " + Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        int arrayLength = array.length;

        if (arrayLength < 2) {
            return;
        }

        int middleIndex = arrayLength / 2;

        int[] leftHalf = new int[middleIndex];
        int[] rightHalf = new int[arrayLength - middleIndex];

        for (int i = 0; i < middleIndex; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = middleIndex; i < arrayLength; i++) {
            rightHalf[i - middleIndex] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        int l = 0; int r = 0; int s = 0;

        while (l < leftSize && r < rightSize) {
            if (left[l] <= right[r]) {
                array[s] = left[l];
                l++;

            } else {
                array[s] = right[r];
                r++;
            }

            s++;
        }

        while (l < leftSize) {
            array[s] = left[l];
            l++;
            s++;
        }

        while (r < rightSize) {
            array[s] = right[r];
            r++;
            s++;
        }
    }
}