/*Given the number of the month, your task is to calculate the number of days present in the particular month.

Note:- Consider non-leap year
Input
Input contains a single integer M (number of month).

Constraints:-
1 <= M <= 12
Output
Print the number of days in the particular month.*/

import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int M = input.nextInt();
if((M==1)||(M==3)||(M==5)||(M==7)||(M==8)||(M==10)||(M==12)){
System.out.println(31);
}
else if ((M==4)||(M==6)||(M==9)||(M==11)){
System.out.println("30");
}
else{
System.out.println("28");
}
}
}