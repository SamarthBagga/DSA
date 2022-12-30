public class eratoSieve {
    public static void main(String[] args) {
        boolean[] primes=new boolean[11];
        sieve(10,primes);

    }

    static void sieve(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if (primes[i]==false){
                System.out.println(i);
            }
        }
    }
}
