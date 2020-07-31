You are given a NXN matrix. You need to find the transpose of the matrix.
The matrix is of form:
a b c ...
d e f ...
g h i ...
...........
There are N elements in each row.
Input
The first line of the input contains an integer N denoting the size of the square matrix.
The next N lines contain N single-spaced integers.

Constraints
1 <= N <= 100
1 <=Ai <= 100000
Output
Output the transpose of the matrix in similar format as that of the input.
Example

Sample Input
2
1 3
2 2

Sample Output
1 2
3 2

Sample Input:
1 2
3 4

Sample Output:
1 3
2 4

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int Mat[][] = new int[N][N];

        for(int j=0;j<N;j++){
            for(int k=0;k<N;k++){
                Mat[j][k] = input.nextInt();
            }
        }
        for(int j=0;j<N;j++){
            for(int k=0;k<N;k++){
                System.out.print(Mat[k][j]+" ");

            }
            System.out.println();
        }
    }
}