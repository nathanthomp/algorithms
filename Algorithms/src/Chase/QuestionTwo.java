package Chase;

import java.io.IOException;
import java.util.*;

class Result {
    private static int[][] getTasksStartAndEndByMachine(List<Integer> start, List<Integer> end) {
        int numberOfMachines = start.size();
        int[][] result = new int[numberOfMachines][2]; // Tasks -> machineNum x Start/End

        for (int i = 0; i < numberOfMachines; i++) {
            // Row 0 is start, row 1 is end
            result[i][0] = start.get(i);
            result[i][1] = end.get(i);
        }

        return result;
    }

    public static int getMinMachines(List<Integer> start, List<Integer> end) {

        // The min task for each machine and run on that machine
        int[][] tasks = getTasksStartAndEndByMachine(start, end);

        // Sort the tasks by machine (min)
        Arrays.sort(tasks, (a, b) -> a[0] - a[1]);

        // Store task end times
        PriorityQueue<Integer> taskEndTimes = new PriorityQueue<Integer>();

        //
        for (int[] task : tasks) {

            // Check if earliest task is finished
            if (!taskEndTimes.isEmpty() && taskEndTimes.peek() < task[0]) {
                taskEndTimes.poll();
            }

            taskEndTimes.add(task[1]);
        }

        return taskEndTimes.size();
    }
}

public class QuestionTwo {
    public static void main(String[] args) throws IOException {

        int[] start = { 1, 2, 3, 4 };
        int[] end = { 1, 2, 3, 4 };
        System.out.println(getMinMachines(start, end));
    }
}
