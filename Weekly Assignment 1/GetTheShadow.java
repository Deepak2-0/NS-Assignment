Given an unsorted array A[] of size N of positive integers. One number 'a' from set {1, 2, …N} is missing and one number 'b' occurs twice in array. The task is to find the repeating and the missing.
Input
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A(1), A(2), ..., A(N) denoting the elements of the array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^5
1 ≤ A[i] ≤ N
Output
For each testcase, in a new line, print b, which is the repeating number, followed by a, which is the missing number, in a single line.
Example

Input:
2
2
2 2
3 
1 3 3

Output:
2 1
3 2
Explanation:
Testcase 1: Repeating number is 2 and smallest positive missing number is 1.
Testcase 2: Repeating number is 3 and smallest positive missing number is 2.

import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i=0;i<T;i++){
            int N= input.nextInt();
            int A[] = new int[N];
            int B[] = new int[N+1];
            int a=0,b=0;
            for (int j=0;j<N;j++){

                A[j] = input.nextInt();

            }
            for(int k=0;k<=N;k++){
                B[k]=0;
            }
            
            for (int k=0;k<N;k++){
                B[A[k]] = B[A[k]]+1;
            }
            for(int k=1;k<=N;k++){
               if(B[k]==2){
                  a=k;
                }
                if(B[k]==0){
                    b=k;
                }
            }
            System.out.println(a +" "+ b);
            
            
            
        }
	}
}