Given a number n find the number of prime numbers less than equal to that number.
Input
There is only one integer containing value of n.

Constraints:-
1 <= n <= 10000000
Output
Return number of primes less than or equal to n
Example

Sample Input
5

Sample Output
3

Explanation:-
2 3 and 5 are the required primes.

Sample Input
5000

Sample Output
669

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int flag=0;
        int count =0;
        if(n==1) System.out.println(0);
        else if (n==2) System.out.println(1);
        else{
            for (int i=3;i<=n;i=i+2){
                flag=0;
                for(int j=3;j<(Math.abs(Math.sqrt(i)))+1;j=j+2){
                    if (i%j==0){
                        flag=1;
                    break;
                    }
                }
                if(flag==0) count++;
            }
            System.out.println(count+1);
        }
    }
}