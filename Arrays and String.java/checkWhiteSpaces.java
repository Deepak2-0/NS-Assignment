Given a string S, check if the given string contains any white space or not.
Input
Input contains a single string S.

Constraints:-
1 < = |S| < = 20


Note:- String will only contain lowercase english letters.
Output
Print "Yes" if the given string contains a whitespace else print "No"
Example

Sample Input:-
newton school

Sample Output:-
Yes

Sample Input:-
newtonschool

Sample Output:-
No

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        if(S.contains(" ")){
             System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }
	}
}