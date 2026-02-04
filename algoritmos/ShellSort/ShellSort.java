public class ShellSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 9, 8, 1, 2, 5};

        System.out.println("original: " + Arrays.toString(array));

        shellSort(array);

        System.out.println("sorted: " + Arrays.toString(sorted));
    }

    private static void shellSort(int[] array) {
        int gap = array.length / 2;

        while (gap > 0) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j;

                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                array[j] = temp;
            }

            gap = gap / 2;
        }
    }
}