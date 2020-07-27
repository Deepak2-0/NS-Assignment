Check if the given string is a palindrome or not?
Palindromes are a numbers, phrases or words that reads same both the ways, backward as well as forward. For example, 1331 is a palindrome because on reversing the digits the number remains the same. But 123 is not a palindrome, as on reversing the digits it becomes 321. So given a number n you have to output whether the number is a palindrome or not.
Print 1 if True and 0 if false.
Input
input contains a single string s.

Constraints:-
1<=|s|<=100000

Note:- String will only contains characters from '0' to '9'.
Output
1 or 0. where 1 means the number is palindrome and zero indicates it's not.

Sample Input-1
1235321

Sample Output-1
1

Sample Input-2
6547

Sample Output-2
0

Sample Input-3
3443

Sample Output-3
1

Sample Input-4
3434

Sample Output-4
0

Explanation:-
Testcase1:-
On reversing the string it becomes 1235321 which is same as original string hence It is a palindrome

import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        String Str = input.next();
        int x = Str.length()-1;
        for(int i=0;i<=x;i++){

            if (Str.charAt(i) != Str.charAt(x)){
               System.out.println(0);
               System.exit(0);
            }
            x--;

        }
        System.out.println(1);
	}
}