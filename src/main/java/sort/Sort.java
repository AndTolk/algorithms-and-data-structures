package sort;

public class Sort {

    //Swaps the elements at the specified positions in the specified int array.
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Swaps the elements at the specified positions in the specified double array.
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        boolean notSorted = true;
        while (notSorted) {
            notSorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    notSorted = true;
                }
            }
        }
    }

    public static void bubbleSort(double[] arr) {
        boolean notSorted = true;
        while (notSorted) {
            notSorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    notSorted = true;
                }
            }
        }
    }
}
