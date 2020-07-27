There are N buildings in a row with different heights(H[i]).
You are viewing the buildings from the left and can see the roof of a building, if no building to the left of that building has height greater than equal to height of that building.
You are asked the number of buildings whose roofs you can see.
Input
The first line contains N denoting number of buildings.
The next line contains N space seperated integers denoting heights of the buildings from left to right.


Constraints
1 <= N <= 100000
1 <= H[i] <= 1000000000000000
Output
The output should contain one integer which is the number of buildings whose roofs you can see.
Example

Sample input: 
5
1 2 2 4 3
 
Sample output:
3

Sample input: 
5
1 2 3 4 5
 
Sample output:
5

Explanation:-
building at index 2 will hide before building at index 3 and building at index 5 will hide before building at index 4

import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int H[]= new int[N];
    int count =0;
    int person=0;
    for(int i=0;i<N;i++){
        H[i] = input.nextInt();
        if (H[i]>person){
            person = H[i];
            count++; 
    
        }


    }

    System.out.println(count);

}
}