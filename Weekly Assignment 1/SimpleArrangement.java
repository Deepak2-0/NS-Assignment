
Given an array A (0 indexed) of n integers from 0 to n-1 (each integer exactly once), output an array such that A[i] becomes A[A[i]].

Make sure you don't use extra memory than array itself.
Input
The first line of the input contains a number n, the number of integers in the array.
The second line of the input contains n numbers, the elements of A.

Constraints
1 <= n <= 100000
0 <= A[i] <= n-1
Output
Output the required array of n integers.
Example

Sample Input
5
4 2 3 0 1 

Sample Output
1 3 0 4 2

Sample Input
10
9 5 1 4 7 8 0 6 3 2

Sample Output
2 8 5 7 6 3 9 0 4 1

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int N= input.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i] = input.nextInt();
        }
        for(int i=0;i<N;i++){
            System.out.print(A[A[i]]+ " ");
        }
	}
}