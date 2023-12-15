import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEruthosine {
    static ArrayList<Long> ARR = new ArrayList<>(50000000); //1000000
    public static void solve(){
        long max = 90000000L;
        Boolean[] arr = new Boolean[(int) max];
        Arrays.fill(arr, false);
        arr[0]=arr[1]=true;
        for(long i=2;i<max;i++){
            if(!arr[(int) i]){

                ARR.add(i);

                for(long j=i*2;j<max;j=j+i){
                    arr[(int) j] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve();
        int num = scanner.nextInt();
        long val;
        for (int i = 0; i < num; i++) {
            val = scanner.nextLong();
            System.out.println(ARR.get((int) val-1));
        }


    }
}
