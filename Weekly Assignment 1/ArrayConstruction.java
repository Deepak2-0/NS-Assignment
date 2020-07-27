You are given two arrays - value and frequency both containing N elements.
There is also a third array C which is currently empty. Then you perform N insertion operation in the array. For ith operation you insert value[i] to the end of the array frequency[i] number of times.
Finally you have to tell the kth smallest element in the array C.
Input
First line of input contains N.
Second line contains N integers denoting array - value
Third line contains N integers denoting array - frequency
Fourth line contains single integer K.

Constraints
1 <= N, value[i], frequency[i] <= 100000
1 <= k <= frequency[1] + frequency[2] +frequency[3] +........ + frequency[N]
Output
Output a single integer which is the kth smallest element of the array C.
Example

Sample input 1
5
1 2 3 4 5
1 1 1 2 2
3

Sample output 1
3

Explanation 1: 
Array C constructed is 1 2 3 4 4 5 5
Third smallest element is 3

Sample input 2
3
2 1 3
3 3 2
2

sample output 2
1

Explanation 2: 
Array C constructed is  2 2 2 1 1 1 3 3
Second smallest element is 1

import java.util.*;

class Number{
    public int value;
    public int frequency;
}
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Number[] numbers = new Number[n];

        for(int i=0; i<n; i++){
            numbers[i] = new Number();
            numbers[i].value = input.nextInt();

        }
        for(int i=0; i<n; i++){
            numbers[i].frequency = input.nextInt();
        }

        Arrays.sort(numbers, (a,b) -> a.value-b.value);

        int k = input.nextInt();
        int i=0;

        while(k>0){
            k= k- numbers[i].frequency;
            i++;
        }

        System.out.println(numbers[i-1].value);
    }

}