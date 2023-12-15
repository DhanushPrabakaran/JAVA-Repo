import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;

public class ABoardGame {
//    public static HashMap<String, Integer> sortByValue(HashMap<Integer, Integer> hm)
//    {
//
//        List<Map.Entry<String, Integer> > list =
//                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
//
//
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
//            public int compare(Map.Entry<String, Integer> o1,
//                               Map.Entry<String, Integer> o2)
//            {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });
//
//
//        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
//        for (Map.Entry<String, Integer> aa : list) {
//            temp.put(aa.getKey(), aa.getValue());
//        }
//        return temp;
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Long,Integer> map = new HashMap<>();
        int m = scan.nextInt();
        int n = m+2;
        long[][] arr = new long[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= scan.nextLong();
                if(map.containsKey(arr[i][j])){
                    Integer count  = map.get(arr[i][j]);
                    map.put(arr[i][j],count+1);
                }else map.put(arr[i][j],1);
            }
        }
        long val = Long.MAX_VALUE;
        for(Map.Entry<Long, Integer> en : map.entrySet()){
//            System.out.println("Key = " + en.getKey() +
//                    ", Value = " + en.getValue());
            if(en.getValue()>=3){
                val = Math.min(en.getKey(),val);
            }

        }
        System.out.println(val);




    }
}
