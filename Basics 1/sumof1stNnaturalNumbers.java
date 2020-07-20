/*Given a positive integer N. You need to print the sum of the first N natural numbers.
Input
The first line of input contains a single integer T, the next T lines contains a single integer N.

Constraints:
1 < = T < = 100
1 < = N < = 100
Output
Print the sum of first N natural numbers for each test case in a new line. */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T=input.nextInt();
        for (int i=0;i<T;i++){
        int N=input.nextInt();
        System.out.println((N*(N+1))/2);
        }
    }
}

