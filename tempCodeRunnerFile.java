import java.util.Arrays;
import java.util.Scanner;

public class CoinExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the amount from the user

        // Get the number of denominations
        System.out.print("Enter the number of denominations: ");
        int n = scanner.nextInt();

        // Get the denominations from the user
        int[] denominations = new int[n];
        System.out.print("Enter the denominations: ");
        for (int i = 0; i < n; i++) {
            denominations[i] = scanner.nextInt();
        }
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        // Calculate the minimum number of coins needed
        int result = minCoins(amount, denominations);
        System.out.println("Minimum number of coins needed: " + result);

        scanner.close();
    }

    public static int minCoins(int amount, int[] denominations) {
        // Sort the denominations array in ascending order
        Arrays.sort(denominations);

        int numCoins = 0;

        for (int i = denominations.length - 1; i >= 0; i--) {
            if (amount == 0) {
                break;
            }

            int coinValue = denominations[i];
            int coinsUsed = amount / coinValue; // Number of coins of this denomination
            numCoins += coinsUsed; // Add the number of coins to the total count
            amount -= coinsUsed * coinValue; // Reduce the amount by the total value of coins used
        }

        return numCoins;
    }
}
