import java.util.Scanner;
public class knapsank {
    public static int knapsackMaxProfit(int W, int[] weights, int[] profits) {
        int n = weights.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0; // Base case
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], profits[i - 1] + dp[i - 1][w - weights[i - 1]]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        int[] profits = new int[n];
        int[] weights = new int[n];

        System.out.println("Enter profits of items:");
        for (int i = 0; i < n; i++) {
            profits[i] = scanner.nextInt();
        }

        System.out.println("Enter weights of items:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.print("Enter knapsack capacity (W): ");
        int W = scanner.nextInt();

        scanner.close();

        int maxProfit = knapsackMaxProfit(W, weights, profits);
        System.out.println("Maximum profit that can be achieved: " + maxProfit);
    }
}


