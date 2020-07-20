/*Given a temperature F in Farenheit, your task is to convert it into Celsius using the following equation:-
T(°c) = (T(°f) - 32)*5/9
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function FahrenheitToCelsius() that takes the integer C parameter.

Constraints:-
-10^3 <= F <= 10^3

Note:- It is guaranteed that F - 32 will be a multiple of 9.
Output
Return a integer containing converted temperature in Fahrenheit.

Example
Sample Input :
77

Sample Output:
25

Sample Input:-
-40

Sample Output:-
-40 */



static int FahrenheitToCelsius(int F){
    return (F-32)*5/9; // Just used the formula
    }