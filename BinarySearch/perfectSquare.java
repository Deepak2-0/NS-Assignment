Given a number N, your task is to find if it is a perfect square or not.
Input
The first line of input contains the number of test cases T, the next T lines contains a single integer N.

Constraints:
1 < = T < = 1000
1 < = N < = 1012
Output
For each test case, print "YES" if the number N is a perfect square else print "NO".
Example

Sample Input:-
2
625
624

Sample Output:-
YES
NO

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        long T= input.nextLong();
        for(long i=0;i<T;i++){
            long N = input.nextLong();

            long low =0;
            long high =100000000;
            long mid = 0;
            int count =0;

            while(low<=high){
                mid = (low+high)/2;
                if((mid*mid) == N){
                    System.out.println("YES");
                    count++;
                    break;
                }
                else if((mid*mid)>N){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
                
            }
            if(count==0) System.out.println("NO");
        }
    }
}