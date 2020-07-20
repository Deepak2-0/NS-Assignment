/*Given a letter of lowercase English alphabet, your task is to determine whether it is a vowel or a consonant.
Input
Input contains a single character alpha.

Constraints:-
'a' <= alpha <= 'z'
Output
Print C if the given alphabet is Consonant else Print V.*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String S =input.next();
        if((S.equals("a"))||(S.equals("e"))||(S.equals("i"))||(S.equals("o"))||(S.equals("u"))){
            System.out.println("V");
        }
        else{
            System.out.println("C");
        }

    }
}