Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
Given N-1 elements your task is to find the missing one.
Input
First line of input contains a single integer N, the next line contains N-1 space separated integers.

Constraints:-
1 < = N < = 1000
1 < = elements < = N
Output
Print the missing element
Example

Sample Input:-
3
3 1

Sample Output:
2

Sample Input:-
5
1 4 5 2

Sample Output:-
3

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int N =input.nextInt();
        int A[] = new int[N];
        int B[]= new int[N-1];
        int sum=0;
        for (int i=1 ; i<=N ; i++){
            sum+= i;
        }

        int newSum=0;
        for(int j=0;j<(N-1);j++){
            B[j]= input.nextInt();
            newSum+= B[j];
        }
        System.out.println(sum - newSum);
	}
}