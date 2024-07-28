import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        long start=System.nanoTime();

        mergeSort(arr);

        long end=System.nanoTime();

        System.out.println("\nSorted Array:");

        System.out.println(Arrays.toString(arr));
        
        System.out.println("Time taken by merge sort: "+(end-start)+" nanoseconds");
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return; // Base case: Arrays with 0 or 1 element are already sorted
        }

        int mid = arr.length / 2;

        // Split array into two halves
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursively sort each half
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves back together
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right arrays and merge them into arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array, if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements from right array, if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}