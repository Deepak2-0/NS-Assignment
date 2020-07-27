In this season of love, everyone wants to surprise each other.
You are also super excited and you wish to buy roses of 3 different colors. You always buy roses in order, white, yellow, red.
So if you buy 7 roses, they will be "white, yellow, red, white, yellow, red, white".

You need to find the number of yellow roses that you will buy?
Input
The only line of input contains a single integer, N, the number of roses that you will buy.

Constraints
1 <= N <= 1000
Output
Output a single integer, the number of yellow roses.
Example

Sample Input 1
2

Sample Output 1
1

Sample Input 2
8

Sample Ouput 2
3

Explanation;-
testcase1;- 2 flower will be white,yellow
so number of yellow flower is 1

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int count = 0;
        int N  =input.nextInt();
        if(N==1 || N==0) System.out.println(0);
        else if(N==2) {
            System.out.println(1);
        }
        else{

        for (int i=1;i<=(N-2);i++){
            if (i%3==0)
            count++;
        }
        System.out.println(count+1);
	    }
    }
}