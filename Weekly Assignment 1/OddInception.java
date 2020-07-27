Siddharth, a great entrepreneur, chooses a person as an intern if he/she good at maths. Thus Sid gives a simple maths problem to the candidate based on which he decides to who is gonna get the offer. Below is the description of the problem asked by Sid
Given arr A[] containing N positive integers. The task is to check whether it is possible to divide the given array into an odd number of non-empty subarrays each of odd length such that each sub-array starts and ends with an odd number. If it is possible to divide the array then print "YES" otherwise "NO".

Note: Don't forget that the complete array is also considered as a subarray
Input
The first line of each test case contains N size of array. Second-line contains N space-separated elements.

Constraints:
1 <= N <= 999999
0 <= A[i] <= 999999999
Output
Print "YES", if it is possible to divide the array. Otherwise, print "NO". Without quotes.
Example

Sample Input 1:
5
9 0 3 1 5

Sample Output 1:
YES

Sample Input 2:
3
1 2 0

Sample Output 2:
NO

Explanation:
Testcase 1: Array {9, 0, 3, 1, 5} can be divided as {9, 0, 3}, {1}, {5}.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner input  = new Scanner(System.in);
        int N= input.nextInt();
        if(N%2 ==0){
            System.out.println("NO");
        }
        else{

            input.nextLine();
            String S = input.nextLine();
            int i=0;
            String firstelement ="";
            while(S.charAt(i) != ' '){
                firstelement += S.charAt(i);
                i++;
            }
            int firstNumber = Integer.parseInt(firstelement);

            int j=S.length()-1;

            char lastelement = S.charAt(j);

            int LastNumber = lastelement - '0';
            if(firstNumber%2 !=0  && LastNumber%2 !=0){
                 System.out.println("YES");
            
            }
            else System.out.println("NO");

        }

        
    }
}