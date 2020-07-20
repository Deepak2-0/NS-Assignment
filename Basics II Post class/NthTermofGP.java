Given first term A and the common ratio R of a GP (Geometric Progression) and an integer N, your task is to calculate its Nth term
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function
NthGP() that takes the integer A, R and N as parameter.


Constraints
1 <= A, R <= 100
1 <= N <= 10
Output
Return the Nth term of the given GP.

Note: It is guaranteed that the Nth term of this GP will always fit in 10^9.
Example
Sample Input:
3 2
5

Sample Output:-
48

Sample Input:-
2 2 
10

Sample Output:
1024

Explanation:-
For Test Case 1:- 3 6 12 24 48 96.

static int NthGP(int A, int R, int N){
    int x=R;
    if(N>1){
    for(int i=2;i<N;i++){
        x=R*x;
    }
    return A*x;
    }
    else return A;
}