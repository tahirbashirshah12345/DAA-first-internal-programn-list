import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the number of elements in the array from user
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();

            // Create an array to store elements
            int[] arr = new int[n];

            // Get the elements from user
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Find the minimum and maximum elements
            int[] minMax = findMinMax(arr);

            // Print the results
            System.out.println("Minimum element: " + minMax[0]);
            System.out.println("Maximum element: " + minMax[1]);
        }

        public static int[] findMinMax(int[] arr) {
            // Initialize min and max with the first element of the array
            int min = arr[0];
            int max = arr[0];

            // Traverse the array to find min and max
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // Return the min and max in an array
            return new int[]{min, max};
        }
    }

