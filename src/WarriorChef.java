import java.util.*;
import java.lang.*;
import java.io.*;
    public class WarriorChef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scan = new Scanner(System.in);
            long n =scan.nextInt();
            while(n-->0){
                int en = scan.nextInt();
                int pow = scan.nextInt();
                int tot=0;
                int[] arr = new int[en];
                for(int i=0;i<en;i++){
                    arr[i]=scan.nextInt();
                    tot+=arr[i];
                }
                if(pow-tot>0){
                    System.out.println(0);

                }else{
                    Arrays.sort(arr);
//                    tot-=arr[0];
                    for(int i=en-1;i>=0;i--){
                        System.out.println(i+"th");
                        if(pow>arr[i]){
                            System.out.println("faliled"+pow+"power"+arr[i]+"arr");
                            pow=pow-arr[i];
                        }else{
                            System.out.println(arr[i]);
//                            break;
                        }
                    }
                }


            }
        }
    }


