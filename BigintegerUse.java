import java.util.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BigInteger L= input.nextBigInteger();
        BigInteger R= input.nextBigInteger();
        BigInteger K= input.nextBigInteger();
        nice(L,R,K);

    }
    public static void nice(BigInteger L, BigInteger R, BigInteger K ){
        //BigInteger count = BigInteger.ZERO;
        long count =0;
        if(L.compareTo(R) > 0){
            System.out.println(count);
             return;
        }

        if((L.mod(K)).equals(BigInteger.ZERO)){
            count++;
            //count = count.add(BigInteger.ONE);
            //System.out.println("Yes");
        }
        nice(L.add(BigInteger.ONE),R, K);

    }
}
