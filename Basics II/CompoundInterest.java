Write a program to find the compound interest for given principal amount P, time Tm(in years), and interest rate R.
Input
The input contains three integers P, R, and Tm.

Constraints:-
1 < = P < = 10^3
1 < = R < = 20
1 < = Tm < = 20
Output
Print the compound interest by 2 decimal places.
Example
Sample Input:
100 1 2

Sample Output:-
2.01

Sample Input:
1 99 2

Sample Output:-
2.96

import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int P= input.nextInt();
        double R= input.nextDouble();
        int Tm= input.nextInt();
        double A = 0;
        double CI=0;
        double I =0;
        I = 1+(R/100);
        double x=1;
        for(int i=0;i<Tm;i++){
            x=x*I;
            //System.out.println(x);
        }
        A = x*P;
        CI = A-P;
        System.out.format("%.2f",CI);
	}
}