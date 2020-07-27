You are given an array Arr of n integers. You can perform the following operations on the array any number of times.
Operation 1: Add or Subtract 2 from any element of the array any number of times
Operation 2: Remove a number from the array
Your aim is to make all the elements of the array equal after performing the above operations any number of times. Report the maximum size of the array possible.
Input
The first line of input contains N, the size of the array
The second line of input contains N space-separated integers

Constraints
1 ≤ N ≤ 100000
1 ≤ Arr[i] ≤ 1000000000
Output
The output should contain only one integer, the maximum size of the array possible such that all elements of the array are equal.
Example

Sample Input 1
5
1 2 3 3 2

Sample Output 1
3

Sample Input 2
2
1 2

Sample Output 2
1

Explanation:-
Testcase1 :- you can remove both 2 from the array making the array equal to 1,3,3. Now subtract 2 from both 3 making the array equal 1,1,1

import java.util.*;
public class Main{
public static void  main(String[] args){
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int x =0;
    int y= 0;
    int A[] = new int[N];
    for (int i = 0;i<N; i++){
        A[i] = input.nextInt();
        if (A[i]%2==0){
            x++;
        }
        else y++;
    }
    if (x>=y){
    System.out.println(x);
    }
    else System.out.println(y);
}
}