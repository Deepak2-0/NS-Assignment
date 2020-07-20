/*Given an integer N, your task is to print all the Armstrong numbers which were present between 1 to N.

A number is said to Armstrong if it is equal to sum of cube of its digits.
Input
The input contains a single integer N.

Constraints:-
1 < = N < = 1000
Output
Print all the number which are armstrong numbers less than equal to N.
Example
Sample Input:-
2

Sample Output:-
1

Sample input:-
4

Sample Output:
1*/


import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int j=0;
        for(int i=1;i<=N;i++){
            j=i;
            int cube =0;
            int digit=0;
            while(j>0){
                digit= j%10;
                cube = cube+(digit*digit*digit);
                j=j/10;
            }
            if(cube==i){
                System.out.print(i+" ");
            }
        }
    }
}

