import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 9, 8, 1, 2, 5};

        System.out.println("original: " + Arrays.toString(array));

        quickSort(array);

        System.out.println("sorted: " + Arrays.toString(array));
    }

    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    private static void quickSort(int[] array, int lowIdx, int highIdx) {
        if (lowIdx >= highIdx) {
            return;
        }

        int pivotIdx = new Random().nextInt(highIdx - lowIdx) + lowIdx;
        int pivot = array[pivotIdx];
        swap(array, pivotIdx, highIdx);

        int leftPointer = lowIdx;
        int rightPointer = highIdx;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIdx);

        quickSort(array, lowIdx, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIdx);
    }

    private static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}