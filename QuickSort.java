import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,2,6,7,9,3,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array into two halves and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, pivotIndex - 1);  // Sort left sub-array
            quickSort(arr, pivotIndex + 1, high); // Sort right sub-array
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Choose the pivot (last element in this case)
        int pivot = arr[high];

        // Index of the smaller element and indicates the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++; // Increment index of smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }
}

