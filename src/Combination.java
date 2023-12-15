import java.util.ArrayList;
import java.util.List;

public class Combination {
    static List<List<Integer>> list =new ArrayList<>();
    public static void solve(int size,int count,int index,ArrayList<Integer> arr ){
        if(size==arr.size()){
//            System.out.println(arr.toString());
            ArrayList<Integer> aa1 = new ArrayList<>(arr);
            list.add(aa1);
//            System.out.println(arr.size());
        }else if(index<=count){
            for(int i=index;i<=count;i++){
                arr.add(i);
                solve(size, count, i+1, arr);
                arr.remove((Integer) i);
            }
        }
    }
    public static List<List<Integer>> combine(int size, int count) {
        list.clear();
        ArrayList<Integer> arr = new ArrayList<>();
        solve(size,count,1,arr);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(combine(2,4).toString());
    }
}
