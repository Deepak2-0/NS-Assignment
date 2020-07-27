Given an array A of size N (N is always even), you need to find exactly (N/2) numbers where each number represents the pair-wise sum of consecutive elements of the array A.

In simple terms print (A[1]+A[2]), (A[3]+A[4]), ..., (A[N-1]+A[N]).
Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N(even number) denoting the number of elements in the array. The next line contains N (white-space separated) integers.


Constraints
1 <= N <= 100
1 <= A[I] <= 1000000000
Output
For each test case, output N/2 elements representing the pairwise sum of adjacent elements in the array.
Example

Input:-1
4
1 2 6 4

output-1
3 10

input-2
10
1 2 3 4 5 6 0 7 8 9

output-2
3 7  11 7 17

Explanation(might now be the optimal solution):
Testcase 1: 
Follow the below steps:-
Step 1: [1 2 6 4]
Step 2: (1 2) and (6 4)
Step 3: 3 10

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int N = input.nextInt();
        int A[] = new int [N];
        for(int i=0;i<N;i++){
            A[i] = input.nextInt();
        }
        for(int j=0;j<N;j+=2){
            long pair = A[j]+A[j+1];
            System.out.print( pair + " ");
        }

    }
}