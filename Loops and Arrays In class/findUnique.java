Given an array of N elements. In the array, each element is present twice except for 1 element whose frequency in the array is 1. Hence the length of the array will always be odd.
Find the unique number.
Input
An integer, N, representing the size of the array. In the next line, N space-separated integers follow.

Constraints:
1 <= N <=105
1 <= A[i] <=108
Output
Output the element with frequency 1.
Example
Input :
5
1 1 2 2 3

Output:
3

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A[] = new int[N];
        int Unique = 0;
        for(int i=0;i<N;i++){
            A[i]=input.nextInt();
            Unique=Unique^A[i];
        }
        System.out.println(Unique);
	}
}