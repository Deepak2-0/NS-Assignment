Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are an anagram of each other.
Input
Input consists of two strings in lowercase english characters.

Constraints:
1 ≤ |s1|, |s2| ≤ 10^5
Output
Print "YES" without quotes if the two strings are anagram else print "NO".
Example

Sample Input
naman
manan

Sample Output
YES

Explanation: Both String contain 2 'a's, 2 'n's and 1 'm'.

import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        int x= s1.length();
        char c1[] =  s1.toCharArray();
        char c2[] = s2.toCharArray();
        char c3[] = new char[x];
        char c4[] = new char[x];
        Arrays.sort(c1);
        String s3 =new String(c1);
        Arrays.sort(c2);
        String s4 = new String(c2);
        if( s3.equals(s4)){
                System.out.println("YES");
        }
        else{
        System.out.println("NO");
        }
        }
}