Given an array of N integers, your task is to calculate the sum of all the odd integers present in the array.
Input
First line of input contains a single integer N. The next line contains the N space separated integers.

Constraints:-
1 < = N < = 1000
1 < = Arr[i] < = 10000
Output
Print the sum of all the odd integers present in the array.

Sample Input:-
4
1 2 3 4

Sample Output:-
4

Sample Input:-
2 4 6 8

Sample Output:-
0

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int N =input.nextInt();
        int Arr[] = new int[N];
        int sum =0;
        for(int i=0;i<N;i++){
            Arr[i]= input.nextInt();
            if(Arr[i]%2!=0){
                sum+=Arr[i];
            }
        }
        System.out.println(sum);
	}
}