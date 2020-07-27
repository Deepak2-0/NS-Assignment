Given an array A[ ] of size N containing positive integers, find maximum and minimum elements from the array.
Input
The first line of input contains an integer T, denoting the number of testcases. The description of T testcases follows. The first line of each testcase contains a single integer N denoting the size of array. The second line contains N space-separated integers denoting the elements of the array.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^7
Output
For each testcase you need to print the maximum and minimum element found separated by space.
Example
Input:
2
5
7 3 4 5 6
4
1 2 3 4

Output:
7 3
4 1


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while(T-->0){
            int N= input.nextInt();
            int A[]=new int[N];
            for(int i=0;i<N;i++){
                A[i] = input.nextInt();
            }
            int max = A[0];
            int min = A[0];
            for(int j=1;j<N;j++){
                if(A[j]<min){
                   min = A[j];
                }
                if(A[j]>max){
                max = A[j];
            }
        }
        System.out.print(max + " ");
        System.out.print(min+"\n");
	    }
    }
}