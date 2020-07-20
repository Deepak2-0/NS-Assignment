Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.
Input
User task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function isPalindrome() which contains N as a parameter.

Constraints:
1 <= N <= 9999
Output
You need to return "true" is the number is palindrome otherwise "false".
Example
Sample Input:
5

Sample Output:
true

Sample Input:
121

Sample Output:
true

static boolean isPalindrome(int N)
    {
       int digit =0;
       int back=0;
       int x=0;
       x=N;

      while(x>0){
         digit = x%10;
         x=x/10;
         back=(back*10) + digit ;

      }
      if(N==back) return true;
      else return false; // your code here
    }