
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chocoloate
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        long num =sc.nextLong();
        while(num-->0){
            long num1 =sc.nextLong();
            int i =0;
            int one=0;
            for(i=1;i<num1;i++){
                if(((i&1)==0 || ((num1-(i * 2L))&1)==0 ) && num1>=(i*2L) ){
                    one=i;
                    System.out.println(one+" "+one+" "+(num1-(one * 2L)));
                    break;
                }
            }

        }
    }
}
