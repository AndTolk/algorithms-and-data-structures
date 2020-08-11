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

    //Sorts int array in ascending order using the bubble sort algorithm.
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

    //Sorts double array in ascending order using the bubble sort algorithm.
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

    //Sorts int array in ascending order using the insertion sort algorithm.
    public static void insertionSort(int[] arr) {
        int j;
        int curr;
        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];
            for (j = i - 1; j >= 0 && curr < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = curr;
        }
    }

    //Sorts double array in ascending order using the insertion sort algorithm.
    public static void insertionSort(double[] arr) {
        int j;
        double curr;
        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];
            for (j = i - 1; j >= 0 && curr < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = curr;
        }
    }

    //Sorts int array in ascending order using a selection sort algorithm.
    public static void selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            swap(arr, i, min);
        }
    }

    //Sorts double array in ascending order using a selection sort algorithm.
    public static void selectionSort(double[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            swap(arr, i, min);
        }
    }

    //Sorts int array in ascending order using the merge sort algorithm.
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    //Sorts int array in ascending order using the merge sort algorithm. Used by the public mergeSort(int[] arr) method.
    private static void mergeSort(int[] arr, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex)
            return;
        int midIndex = (lowIndex + highIndex) / 2;
        mergeSort(arr, lowIndex, midIndex);
        mergeSort(arr, midIndex + 1, highIndex);
        merge(arr, lowIndex, midIndex, highIndex);
    }

    // Merges two subarrays [lowIndex ... midIndex] and [midIndex + 1 ... highIndex] in the arr
    private static void merge(int[] arr, int lowIndex, int midIndex, int highIndex) {

        int lengthLeft = midIndex - lowIndex + 1;
        int lengthRight = highIndex - midIndex;

        int[] leftArr = new int[lengthLeft];
        int[] rightArr = new int[lengthRight];

        System.arraycopy(arr, lowIndex, leftArr, 0, lengthLeft);
        System.arraycopy(arr, midIndex + 1, rightArr, 0, lengthRight);

        int i = 0, j = 0, k = lowIndex;

        while (i < lengthLeft && j < lengthRight) {
            if (leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }

        while (i < lengthLeft)
            arr[k++] = leftArr[i++];

        while (j < lengthRight)
            arr[k++] = rightArr[j++];
    }

    //Sorts double array in ascending order using the merge sort algorithm.
    public static void mergeSort(double[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    //Sorts double array in ascending order using the merge sort algorithm. Used by the public mergeSort(double[] arr) method.
    private static void mergeSort(double[] arr, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex)
            return;
        int midIndex = (lowIndex + highIndex) / 2;
        mergeSort(arr, lowIndex, midIndex);
        mergeSort(arr, midIndex + 1, highIndex);
        merge(arr, lowIndex, midIndex, highIndex);
    }

    // Merges two subarrays [lowIndex ... midIndex] and [midIndex + 1 ... highIndex] in the arr
    private static void merge(double[] arr, int lowIndex, int midIndex, int highIndex) {

        int lengthLeft = midIndex - lowIndex + 1;
        int lengthRight = highIndex - midIndex;

        double[] leftArr = new double[lengthLeft];
        double[] rightArr = new double[lengthRight];

        System.arraycopy(arr, lowIndex, leftArr, 0, lengthLeft);
        System.arraycopy(arr, midIndex + 1, rightArr, 0, lengthRight);

        int i = 0, j = 0, k = lowIndex;

        while (i < lengthLeft && j < lengthRight) {
            if (leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }

        while (i < lengthLeft)
            arr[k++] = leftArr[i++];

        while (j < lengthRight)
            arr[k++] = rightArr[j++];
    }
}
