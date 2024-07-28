import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};

        selectionSort(arr);
        System.out.println("the sorted array is " + Arrays.toString(arr));

    }
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j =i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}