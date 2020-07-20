You are given a cubic dice with 6 faces. All the individual faces have a numbers printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to find the number on the opposite face of the cube.
Input
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows. Each test case contains a single line of the input containing a positive integer N.

Constraints:
1 <= T <= 100
1 <= N <= 6
Output
For each testcase, print the number that is on the opposite side of the given face.
Example
Input:
2
6
2

Output:
1
5

Explanation:
Testcase 1: For dice facing number 6 opposite face will have the number 1.

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T= input.nextInt();
        for(int i=0;i<T;i++){
            int N =input.nextInt();
            System.out.println(7-N);
        }
    }
}