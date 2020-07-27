Given two strings A and B, check if the string A is a sub-string of string B or not.
Input
First line of input contains a string A, the second line of the input contains the string B.

Constraints:-
1 < = |A| < = |B| < = 1000

Note:- String will only contain lowercase english letters.
Output
Print "Yes" if the string A is the substring of string B, else print "No".
Example

Sample Input:-
ewt
newton

Sample Output:-
Yes

Sample Input:-
erf
sdafa

Sample Output:-
No

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        if(B.contains(A)){
             System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }
	}
}