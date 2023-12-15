import java.util.*;


public class Pattern {
      public static class Solution {
           public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
               tasks.sort(Collections.reverseOrder());
               Collections.sort(processorTime);

               int numTasks = tasks.size();
               int numProcessors = processorTime.size();
               int minProcessingTime = 0;
               int left = 0, right = numTasks - 1;

               while (left <= right) {
                   int currentTask = tasks.get(left);
                   int processorIdx = numProcessors - 1;

                   while (processorIdx >= 0 && right >= left) {
                       minProcessingTime = Math.max(minProcessingTime, currentTask + processorTime.get(processorIdx));
                       System.out.println(minProcessingTime);
                       processorIdx--;
                       right--;
                   }
                   left++;
               }

               return minProcessingTime;
           }


       }
       public static void main(String[] args) {
            List<Integer> processorTime = Arrays.asList(8, 10);
            List<Integer> tasks = Arrays.asList(2, 2, 3, 1, 8, 7, 4, 5);

            Solution solution = new Solution();
            int result = solution.minProcessingTime(processorTime, tasks);
            System.out.println(result); // Output should be 360
        }
}


