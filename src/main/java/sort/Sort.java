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
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            swap(arr,i,min);
        }
    }

    //Sorts double array in ascending order using a selection sort algorithm.
    public static void selectionSort(double[] arr) {
        int min;
        for (int i = 0; i <arr.length; i++) {
            min = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            swap(arr,i,min);
        }
    }
}
