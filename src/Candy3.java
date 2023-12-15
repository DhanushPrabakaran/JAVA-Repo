import java.util.Scanner;

 class Candy3 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        while (n-->0){
            int siz = scanner.nextInt();
            long tot = 0;
            for(int i=0;i<siz && scanner.hasNext() ;i++){
                tot+=scanner.nextLong();
            }
            if(tot%siz==0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
