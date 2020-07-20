Given a number N, you need to count the integers which are multiple of N between 1 to 100. Return the count.
Input
User task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function countMultiples() which contains N as a parameter.

Constraints:
1 <= N <= 100
Output
You need to return the count.
Example
Sample Input:
3

Sample Output:
33

Sample Input:
4

Sample Output:
25

static int countMultiples(int N)
    {
       int count =0;
      for(int i=1;i<=100;i++){
         if(i%N==0){
            count++;
         }
      }
      return count; //  your code here
    }