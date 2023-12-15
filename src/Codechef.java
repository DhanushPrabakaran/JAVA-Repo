import java.util.*;
public class Codechef {
    public static boolean isPrime(long number) {
        if (number <= 1 || number%2==0)return false;
        for (long i = 3; i * i <= number; i += 2) {
            if (number %i == 0) return false;
        }
        return true;
    }
    public static long isSum(long num) {
        long tot =0;
        long temp = 0;
        while (num>0){
            temp = num%10;
            tot+=temp;
            num=num/10;
        }
        return tot;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long s = scan.nextLong();
        boolean flag = true;
        for (int i=6;i<Math.sqrt(s);i++){
            System.out.println();
            while(s%i==0 &&  isPrime(i)){
                System.out.println("No");
                flag=false;
                break;
            }
        }
        if (flag) System.out.println("Yes");
    }
}
