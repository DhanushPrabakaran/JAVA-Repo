import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> list =new ArrayList<>();
    public static void solve(int target,int length,ArrayList<Integer> arr ,int[] candidates){
        int sum = arr.stream().mapToInt(integer -> integer).sum();
        if(sum>target) return;
        if(sum==target) {
            ArrayList<Integer> aa1 = new ArrayList<>(arr);
            Collections.sort(aa1);
            if(!list.contains(aa1)){list.add(aa1);}


        }else{
            for(int i=0;i<length;i++){
                arr.add(candidates[i]);
                solve(target, length, arr,candidates);
                arr.remove((Integer) candidates[i]);
            }
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        list.clear();

        ArrayList<Integer> arr = new ArrayList<>();
        solve(target,candidates.length,arr,candidates);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,5},8).toString());
    }
}
