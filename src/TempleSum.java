public class TempleSum {
    public static  long SolveY(long k,long n,long mod){
        if(n==0) return 1;
        if((n&1)==1)return (1+k)*SolveY((k*k)%mod,(n-1)/2 ,mod)%mod;
        else return (1+k)*(1+k)*SolveY((k*k)%mod,(n/2)-1,mod)%mod;
    }
    public static  long SolveX(long k,long n,long mod){
        if(n==0) return 1;
        else if(n==1) return n;
        else if((n&1)==0) return SolveX((k*k)%mod,n/2,mod);
        else  return SolveX(((k*k)%mod)*k,n/2,mod);
    };
    public static  void  Solve(long n,long k,long mod){

        System.out.println(SolveX(k,n,mod)+" "+SolveY(k,n,mod));

    }
    public static void main(String[] args) {
        Solve(2,3,17);
    }
}
