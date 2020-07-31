Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degree and 180 degree.
Input
First line contains N.
N lines follow each containing N space seperated integers.

2 <= N <= 100
1 <= Mat[i][j] <= 10000
Output
Output 2*N+1 lines.
First N lines should contain the Matrix rotated by 90 degrees.
Then print a blank line.
Then N lines should contain the Matrix rotated by 180 degrees.
Example


Sample Input
2
3 4 
7 6 

Sample Output
7 3 
6 4 

6 7 
4 3

Sample Input:
1 2
3 4

Sample Output:
3 1
4 2

4 3
2 1

import java.util.*;
public  class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int Arr[][] = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Arr[i][j] = input.nextInt();
            }
        }
        int B[][] = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                B[i][j] = Arr[j][i];
            }
        }
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--){
                System.out.print(B[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();// till 90 degree correct

        
        /*for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                C[i][j] = B[j][i];
            }
        } */
        for(int i=N-1;i>=0;i--){
            for(int j=N-1;j>=0;j--){
                System.out.print(Arr[i][j]+ " ");
            }
            System.out.println();
        }

        /*for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--){
                System.out.print(C[i][j]+ " ");
            }
            System.out.println(); 
        }*/

    }
}