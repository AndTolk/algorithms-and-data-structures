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
        if(arr.length < 2)
            return;
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
        if(arr.length < 2)
            return;
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

    public static void insertionSort(int[] arr) {
        if(arr.length < 2)
            return;
        int j;
        int curr;
        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];
            for (j = i - 1; j >= 0 && curr < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1] = curr;
        }
    }

    public static void insertionSort(double[] arr) {
        if(arr.length < 2)
            return;
        int j;
        double curr;
        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];
            for (j = i - 1; j >= 0 && curr < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1] = curr;
        }
    }
}
