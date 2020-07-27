Given an array of N integers, check if it contains any negative integer.
Input
First line of input contains a single integer N. The next line contains the N space separated integers.

Constraints:-
1 < = N < = 1000
-10000 < = Arr[i] < = 10000
Output
Print "Yes" if the array contains any negative integer else print "No".
Example

Sample Input:-
4
1 2 3 -3

Sample Output:-
Yes

Sample Input:-
3
1 2 3

Sample Output:-
No

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++){
            A[i]=input.nextInt();
            if(A[i]<0){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
	}
}