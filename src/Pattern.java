import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        for(long i=num;i>0;i--){
            long m= (int) Math.toIntExact(i);
            for(int j=0;j<num;j++){


                System.out.printf("%d",m);
                if(m!=num){
                    //printf("%d",m);
                    m+=1;
                }

            }
            System.out.println();
        }
    }
}
