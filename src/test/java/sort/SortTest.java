package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void testIntBubbleSort() {
        int[] actual = new int[0];
        int[] expected = new int[0];
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{1};
        expected = new int[]{1};
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{2, 1};
        expected = new int[]{1, 2};
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{9, 6, 3, 2, 5, 8, 7, 4, 1, 0};
        expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{2, 3, 3, 3, 2, 2, 0, 1, 1, 0, -4, -2, -1, -3};
        expected = new int[]{-4, -3, -2, -1, 0, 0, 1, 1, 2, 2, 2, 3, 3, 3};
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDoubleBubbleSort() {
        double[] actual = new double[0];
        double[] expected = new double[0];
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{1};
        expected = new double[]{1};
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{2, 1};
        expected = new double[]{1, 2};
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{0.2, 0.1, 1.2, 1.0, 2.5};
        expected = new double[]{0.1, 0.2, 1.0, 1.2, 2.5};
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{-1.0, -5, 0.0, 0.0, 0.66667, 0.66666};
        expected = new double[]{-5, -1.0, 0, 0, 0.66666, 0.66667};
        Sort.bubbleSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testIntInsertionSort() {
        int[] actual = new int[0];
        int[] expected = new int[0];
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{1};
        expected = new int[]{1};
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{2, 1};
        expected = new int[]{1, 2};
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{9, 6, 3, 2, 5, 8, 7, 4, 1, 0};
        expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{2, 3, 3, 3, 2, 2, 0, 1, 1, 0, -4, -2, -1, -3};
        expected = new int[]{-4, -3, -2, -1, 0, 0, 1, 1, 2, 2, 2, 3, 3, 3};
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDoubleInsertionSort() {
        double[] actual = new double[0];
        double[] expected = new double[0];
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{1};
        expected = new double[]{1};
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{2, 1};
        expected = new double[]{1, 2};
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{0.2, 0.1, 1.2, 1.0, 2.5};
        expected = new double[]{0.1, 0.2, 1.0, 1.2, 2.5};
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{-1.0, -5, 0.0, 0.0, 0.66667, 0.66666};
        expected = new double[]{-5, -1.0, 0, 0, 0.66666, 0.66667};
        Sort.insertionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testIntSelectionSort() {
        int[] actual = new int[0];
        int[] expected = new int[0];
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{1};
        expected = new int[]{1};
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{2, 1};
        expected = new int[]{1, 2};
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{9, 6, 3, 2, 5, 8, 7, 4, 1, 0};
        expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{2, 3, 3, 3, 2, 2, 0, 1, 1, 0, -4, -2, -1, -3};
        expected = new int[]{-4, -3, -2, -1, 0, 0, 1, 1, 2, 2, 2, 3, 3, 3};
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDoubleSelectionSort() {
        double[] actual = new double[0];
        double[] expected = new double[0];
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{1};
        expected = new double[]{1};
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{2, 1};
        expected = new double[]{1, 2};
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{0.2, 0.1, 1.2, 1.0, 2.5};
        expected = new double[]{0.1, 0.2, 1.0, 1.2, 2.5};
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{-1.0, -5, 0.0, 0.0, 0.66667, 0.66666};
        expected = new double[]{-5, -1.0, 0, 0, 0.66666, 0.66667};
        Sort.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testIntMergeSort() {
        int[] actual = new int[0];
        int[] expected = new int[0];
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{1};
        expected = new int[]{1};
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{2, 1};
        expected = new int[]{1, 2};
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{9, 6, 3, 2, 5, 8, 7, 4, 1, 0};
        expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);

        actual = new int[]{2, 3, 3, 3, 2, 2, 0, 1, 1, 0, -4, -2, -1, -3};
        expected = new int[]{-4, -3, -2, -1, 0, 0, 1, 1, 2, 2, 2, 3, 3, 3};
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDoubleMergeSort() {
        double[] actual = new double[0];
        double[] expected = new double[0];
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{1};
        expected = new double[]{1};
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{2, 1};
        expected = new double[]{1, 2};
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{0.2, 0.1, 1.2, 1.0, 2.5};
        expected = new double[]{0.1, 0.2, 1.0, 1.2, 2.5};
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);

        actual = new double[]{-1.0, -5, 0.0, 0.0, 0.66667, 0.66666};
        expected = new double[]{-5, -1.0, 0, 0, 0.66666, 0.66667};
        Sort.mergeSort(actual);
        assertArrayEquals(expected, actual);
    }
}