import java.util.*;

public class JobSeq {
    public class Jobs {
        int deadline;
        int profit;

        Jobs(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void jSeq(ArrayList<Jobs> jobsList) {
        int maxDeadline = 0;
        for (int i = 0; i < jobsList.size(); i++) {
            if (maxDeadline <= jobsList.get(i).deadline) {
                maxDeadline = jobsList.get(i).deadline;
            }
        }

        int[] result = new int[maxDeadline]; // To store the result of selected jobs
        boolean[] slot = new boolean[maxDeadline]; // To keep track of available slots

        for (int i = 0; i < maxDeadline; i++) {
            slot[i] = false;
        }

        for (int i = 0; i < jobsList.size(); i++) {
            for (int j = Math.min(maxDeadline, jobsList.get(i).deadline) - 1; j >= 0; j--) {
                if (slot[j] == false) {
                    result[j] = i;
                    slot[j] = true;
                    break;
                }
            }
        }

        // Print the selected jobs
        System.out.println("Selected Jobs (in order of completion):");
        int totalProfit = 0;
        for (int i = 0; i < maxDeadline; i++) {
            if (slot[i]) {
                Jobs job = jobsList.get(result[i]);
                System.out.println("Deadline: " + job.deadline + ", Profit: " + job.profit);
                totalProfit += job.profit;
            }
        }
        System.out.println("Total Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        int arr[][] = {{4, 50}, {1, 20}, {1, 30}, {1, 40}};
        JobSeq jobSeq = new JobSeq();
        ArrayList<Jobs> jobsList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            jobsList.add(jobSeq.new Jobs(arr[i][0], arr[i][1]));
        }

        Collections.sort(jobsList, (a, b) -> b.profit - a.profit);

        for (Jobs job : jobsList) {
            System.out.println("Deadline: " + job.deadline + ", Profit: " + job.profit);
        }

        jSeq(jobsList);
    }
}
