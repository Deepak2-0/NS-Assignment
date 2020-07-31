Given an N*N matrix. Print the elements of the matrix in anticlockwise order (see the sample for better understanding).
Input
First line contains N.
N lines follow each containing N space seperated integers.

Constraints:-
2 <= N <= 500
1 <= Mat[i][j] <= 1000
Output
Output N*N integers in a single line separated by spaces, which are the elements of the matrix in anti-clockwise order.
Example

Sample Input
4
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16 

Sample output 
1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7 

Sample Input 
3
1 2 3 
4 5 6 
7 8 9 

Sample output
1 4 7 8 9 6 3 2 5

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N= input.nextInt();

        StringBuffer str = new StringBuffer("");
        int Mat[][] = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Mat[i][j] = input.nextInt();
                
            }

        }
        int count = 0;
        int total = N*N;
        int rowstart =0;
        int columnstart=0;
        int rowend = N-1;
        int columnend = N-1;

        while(rowstart<=rowend && columnstart<=columnend && count<=total){
            for(int i=rowstart;i<=rowend;i++){
                str.append(Mat[i][columnstart]+ " ");
                count++;
            }
            columnstart++;

            for(int i=columnstart;i<=columnend;i++){
                str.append(Mat[rowend][i]+" ");
                count++;
            }
            rowend--;
            if(rowstart<=rowend){
                for(int i=rowend;i>=rowstart;i--){
                    str.append(Mat[i][columnend]+ " ");
                    count++;
                }
                columnend--;
            }
            if(columnstart<=columnend){
                for(int i=columnend;i>=columnstart;i--){
                    str.append(Mat[rowstart][i]+" ");
                    count++;
                }
                rowstart++;
            }

        }
        System.out.println(str);
    }
}