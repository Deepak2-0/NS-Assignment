/*Write a program to find the minimum number of coins/ notes required to make the change of A amount of money.
For this problem, you can assume that there is an unlimited supply of the various notes/coins available in the Indian currency denominations. The various denominations available are 1, 2, 5, 10, 20, 50, 100, 200, 500 and 2000.
Input
The first line of the input contains the number of test cases T.
Each test case contains a single input A(amount).

Constraints:
1 <= T <= 100000
1 <= A <= 10^5
Output
For each test case, print the minimum number of changes of amount A. */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int count = 0;
        int Z[] = new int[T];
        for(int i=0;i<T;i++){
            int A = input.nextInt();
            while(A>0){
                if(A>=2000){
                    A-=2000;
                    count++;
                }
                else if(A>=500){
                    A-=500;
                    count++;
                }
                else if(A>=200){
                    A-=200;
                    count++;
                }
                else if(A>=100){
                    A-=100;
                    count++;
                }
                else if(A>=50){
                    A-=50;
                    count++;
                }
                else if(A>=20){
                    A-=20;
                    count++;
                }
                else if(A>=10){
                    A-=10;
                    count++;
                }
                else if(A>=5){
                    A-=5;
                    count++;
                }
                else if(A>=2){
                    A-=2;
                    count++;
                }
                else{
                    A-=1;
                    count++;
                }
            }
            Z[i]=count;
            count =0;
        }
        for(int j=0;j<T;j++){
            System.out.println(Z[j]);
        }
    }
}