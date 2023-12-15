public class Factorization {
    public static void TrailDivision(long num){
        long d =2;
        while (num>1 ){
            if(num%d==0){
                num/=d;
                System.out.println(d);
            }else {
                d++;
            }
        }
    }
    public static void WheelFactorization(long num){
        long d =2;
        while (num>1 && num%d==0 ){
                num/=d;
                System.out.println(d);
        }
        d++;
        while (num>1 ){
            if(num%d==0){
                num/=d;
                System.out.println(d);
            }else {
                d+=2;
            }
        }
    }

    public static void PreComputedPrime(long num) {
        long d = 2;
        while (num>1 && d<=3){
            if(num%d==0){
                System.out.println(d);
                num/=d;
//                System.out.println(d);
            }else {
                d++;
            }
        }
        long a =5,b=7;
        while (num>1 && (d*d)<=num){
            d=Math.min(a,b);
            if(num%d==0){
                num/=d;
                System.out.println(d);
            }else {
                if(d==a){
                    a+=6;
                }else {
                    b+=6;
                }
            }
        }

    }

    public static void FermetFactorization(long num) {
        long d=2;
        if(num%d==0){
            System.out.println(d);
            FermetFactorization(num/2);
        }
        else {
            long a = (long) Math.ceil(Math.sqrt(num));
            while (true){
                long b2 = a*a - num;
                long b= (long) Math.sqrt(b2);
                if(b*b == b2){

                }
            }

        }

    }
    public static void main(String[] args) {
        System.out.println("trail");
        TrailDivision(432);
        System.out.println("wheel");
        WheelFactorization(522);
        System.out.println("pree");
        PreComputedPrime(522);
    }

}
