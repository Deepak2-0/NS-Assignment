Given two integers a and b, your task is to check following conditions:-
1. If a <= 10 and b >= 10 (Logical AND).
2. Atleast one from a or b will be even (Logical OR).
3. if a is not equal to b (Logical NOT).
Input
User task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the functions:-
Logical_AND(), which contains integers a and b as a parameter.
Logical_OR(), which contains integers a and b as a parameter.
Logical_NOT(), which contains integers a and b as a parameter.

Constraints:
1 <= a, b <= 100
Output
Return true if the condition holds in each function else false
Example

Sample Input:-
3 12

Sample Output:-
true true true

Sample Input:-
10 10

Sample Output:-
true true false


static boolean Logical_AND(int a, int b){
    if (a<=10 && b>=10) return true;
    else return false;
}
static boolean Logical_OR(int a, int b){
    if(a%2==0 || b%2==0) return true;
    else return false;
//Enter your code here
}

static boolean Logical_NOT(int a, int b){
    if (a!=b) return true;
    else return false;
//Enter your code here
}