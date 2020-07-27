Given an array A[] of size N, containing positive integers. You need to print the sum and mean (floor value) of given numbers.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function:- SumAndMean() that takes the Array and the integer N as parameter.

Constraints:-
1 <= N <= 100
1 <= A[i] <= 100
Output
Print the Sum and the Mean of the array separated by a space.
Example

Sample Input:
5
1 2 19 28 5

Sample Output:
55 11

Sample Input:-
4
2 8 3 4

Sample Output:-
17 4

Explanation:
Test case 1: For array of 5 elements, mean is (1 + 2 + 19 + 28 + 5)/5 = 11. Mean is 11.
Test case 2: For array of 4 elements, mean is floor((2 + 8 + 3 + 4)/4) = 4. Mean is floor(17/4) = 4

static void SumAndMean(int arr[],int N){
  int sum=0;
  for(int i=0;i<N;i++){
    sum=sum+arr[i];
  }
  System.out.print(sum +" "+(sum/N));
}