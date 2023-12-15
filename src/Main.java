import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        long[][] arr = new long[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = scan.nextLong();

        for (int i = 0; i < m + n - 1; i++) {
            int l = 0;
            int k = Math.min(i,);
            while (l >= 0 && k < m) {
                System.out.print(arr[k][l] + " ");
                l++;
                k++;
            }
            System.out.println();
            System.out.println();
        }


    }
}
