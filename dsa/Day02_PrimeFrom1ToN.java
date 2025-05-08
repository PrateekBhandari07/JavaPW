package JavaPW.dsa;

public class Day02_PrimeFrom1ToN
{
    public static void main(String[] args) {
        int n=29;

        for(int i=2;i<=n;i++){
            boolean prime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0) prime=false;
            }
            if(prime) System.out.print(i+" ");
        }
    }
}
