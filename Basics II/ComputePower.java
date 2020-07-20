You are given two numbers n and p. You need to find n raised to the power p.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function RecursivePower that takes the integer n and p as a parameter.

Constraints:
1 <= T <= 10
1 <= n, p <= 9
Output
Return n^p.
Example
Sample Input:
3
2 3
9 9
2 9

Sample Output:
8
387420489‬
512

Explanation:
Test case 2: 387420489 is the value obtained when 9 is raised to the power of 9.
Test case 3: 512 is the value obtained when 2 is raised to the power of 9

static int RecursivePower(int n,int p){
     int x=1;
     for(int j=0;j<p;j++){
          x=x*n;
     }
     return x;
}