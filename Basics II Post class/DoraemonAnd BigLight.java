Gian and Suneo want their heights to be equal so they asked Doraemon's help. Doraemon gave a big light to both of them but the both big lights have different speed of magnifying. Let's assume the big light given to Gian can increase height of a person by v1 m/s and that of Suneo's big light is v2 m/s.
At the end of each second Doraemon check if their heights are equal or not.
Given initial height of Gian and Suneo, your task is to check whether the height of Gian and Suneo will become equal at some point or not, assuming they both started at the same time.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function
EqualOrNot() that takes the integer h1(height of gian), h2(height of suneo), v1(speed of Gian's big light) and v2(speed of Suneo's big light) as parameter.

Constraints:-
1 <= h2 < h1<=10000
1 <= v1 <= 10000
1 <= v2 <=10000
Output
Return true if their height will become equal at some point (as seen by Doraemon) else return false.
Example

Sample input:-
4 2 2 4

Sample output:-
Yes

Explanation:-
height of Gian goes as- 4 6 8 10. .
height of Suneo goes as:- 2 6 10..
at the end of 1 second their height will become equal.

Sample Input:-
5 4 1 6

Sample Output:
No

static boolean EqualOrNot(int h1, int h2, int v1,int v2){
    double x=0;
    x =(double) (h2-h1)/(v1-v2);
    if((double) x == (int)x) return true;
    else return false;
}