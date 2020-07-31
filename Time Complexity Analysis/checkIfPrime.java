Given an integer, print whether that integer is a prime number or not.
Input
First line of input contains an integer T, showing the number of test cases. Every test case is a single integer A.

Constraints
1 <= T <= 100
1 <= A <= 10^8
Output
If the given integer is prime, print 'Yes', else print 'No'.
Example

Sample Input
3
5
9 
13

Output
Yes
No
Yes

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T= input.nextInt();
        for(int i=0;i<T;i++){
            int N= input.nextInt();
            int flag=0;
            if(N%2==0 && N>2){
            System.out.println("No");
            }
            else{
            for (int j=3;j<=Math.ceil(Math.sqrt(N));j=j+2){
                if(N%j==0){
                    System.out.println("No");
                    flag =1;
                    break;
                }
            }
            if(flag==0) System.out.println("Yes");
            }

        }
    }
}