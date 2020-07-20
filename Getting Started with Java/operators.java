/*Given two integers a and b, your task is to calculate :-
a+b
a-b
a*b
a/b
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function
Operators() that takes the integer a and b as parameter.

Constraints:
1 <= b <= a <= 1000

Note: It is guaranteed that a will be divisible by b.
Output
Print the mentioned operations each in a new line. */

static void Operators(int a,int b){
int add=a+b;
int diff=a-b;
int multi=a*b;
int div=a/b;
System.out.println(add);
System.out.println(diff);
System.out.println(multi);
System.out.println(div);//Enter your code here
}