There is circular river with circumference K. There are N cities on the banks of the river. The position p(i) of the i-th city is defined as its distance from the topmost point of the river in the clockwise manner.
You are given the positions of all the N cities, your task is to find the minimum distance you need to travel to visit all the N cities. You can start at whichever point you like, and can move both clockwise and anticlockwise around the river.

See sample for better understanding.

Topmost point here refers to one fixed point on the banks of the river.
Input
The first line of the input contains two number K and N.
The second line contains N singly spaced integers denoting the position of cities p(1), p(2),. , p(N).

Constraints
1 <= N <= 200000
1 <= K <= 1000000
0 <= p(1) < p(2) < p(3). . < p(N) < K
Output
Output a single integer, the minimum distance you need to cover to visit all the N cities.
Example

Sample Input
20 3
0 5 15

Sample Output
10

Explanation: We start at 3rd city, then visit 1st city, then visit 2nd city. Total distance covered = 5 + 5 = 10.

Sample Input
20 3
5 10 15

Sample Output
10

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int  K = input.nextInt();
        int  N = input.nextInt();
        int topmost = 0;
        int total=0;
        int lastDistance = 0;
        int P[] = new int[N];
        for(int i=0;i<N;i++){
            P[i] = input.nextInt();
            
        }
        lastDistance = K- P[N-1]+P[0];
        int max = 0;
        // System.out.println(last);
        for(int i=1;i<N;i++){
            if((P[i]-P[i-1])>max){
                max = P[i]-P[i-1];
            }
        }
        if(lastDistance>max){
            System.out.println(K-lastDistance);
        }
        else System.out.println(K-max);
        

    }
}