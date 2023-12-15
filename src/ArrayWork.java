import java.util.Arrays;
import java.util.Scanner;

public class ArrayWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row  = scan.nextInt();
        long[] arr = new long[row];
        long odd =0;
        long even =0;
        for(int i=0;i<row;i++){
            arr[i]=scan.nextLong();
            if((arr[i]&1)==0)even++;
            else odd++;
        }
        System.out.println(odd + " " + even);

    }
}
