
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;


public class Permutation {

        public static boolean IsSafe(int ind,boolean[] visited) {
            return !visited[ind];
        }
        public static void Solve(int[] ori, int ind, int[] str, boolean[] visited){
            int len = ori.length;
            if (len ==ind) {
                System.out.println(Arrays.toString(str));
//                ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.stream(str)
//                        .boxed()
//                        .collect(Collectors.toList());
////                List<int[]> arr = Arrays.asList(str);
//               list.add(arr);
//             return list;
//                System.out.println();
            }else {
                for(int i=0;i<len;i++){
                    if(IsSafe(i,visited)){
                        visited[i]=true;
                        str[i]=ori[ind];
                        Solve(ori, ind+1, str, visited);
                        visited[i]=false;
                        str[i]='\0';
                    }
                }
            }

        }


    public static  void nextPermutation(int[] ori) {
            int[] str  = new int[ori.length];
            boolean[] visited = new boolean[ori.length];
//        visited[0]=true;
//            for (int i=0;i< ori.length;i++){visited[i]=true;}
            Solve(ori,0,str,visited);
//        System.out.println(Arrays.toString(list.toArray()));
        }
        public static void main(String[] args) {
            int []num = {3,2,1};
            nextPermutation(num);
        }
}
