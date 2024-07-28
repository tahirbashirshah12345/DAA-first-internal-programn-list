
    import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

    class Job {
        int id, deadline, profit;

        // Constructor
        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public class jobSequencing {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the number of jobs from user
            System.out.print("Enter the number of jobs: ");
            int n = scanner.nextInt();

            // Create an array to store jobs
            Job[] jobs = new Job[n];

            // Get job details from user
            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for Job " + (i + 1) + ":");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                System.out.print("Deadline: ");
                int deadline = scanner.nextInt();
                System.out.print("Profit: ");
                int profit = scanner.nextInt();
                jobs[i] = new Job(id, deadline, profit);
            }

            // Calculate maximum profit using job sequencing
//            int maxProfit = jobSequencing(jobs);
//            System.out.println("The maximum profit is: " + maxProfit);
//
//            scanner.close();
//        }

//        public static int jobSequencing(Job[] jobs) {
            // Step 1: Sort jobs in decreasing order of profit
            Arrays.sort(jobs, (a,b)->b.profit - a.profit);

            // Step 2: Find the maximum deadline
            int maxDeadline = 0;
            for (Job job : jobs) {
                if (job.deadline > maxDeadline) {
                    maxDeadline = job.deadline;
                }
            }

            // Step 3: Create a schedule array to keep track of used time slots
            int[] schedule = new int[maxDeadline];
            Arrays.fill(schedule, -1); // Initialize all slots to -1 (meaning empty)

            int totalProfit = 0;

            // Step 4: Iterate through the sorted jobs and schedule each job
            for (Job job : jobs) {
                for (int j = job.deadline - 1; j >= 0; j--) {
                    if (schedule[j] == -1) { // If the slot is empty
                        schedule[j] = job.id; // Assign the job to this slot
                        totalProfit += job.profit;
                        break;
                    }
                }

            }
            System.out.println("The maximum profit is: " + totalProfit);

        }
    }
