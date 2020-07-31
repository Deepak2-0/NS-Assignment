Given an array arr[] of size N and a number K, the task is to find the smallest number M such that the sum of the array becomes lesser than or equal to the number K when every element of that array is divided by the number M.

Note: Each result of the division is rounded to the nearest integer greater than or equal to that element. For example: 10/3 = 4 and 6/2 = 3
Input
The first line contains two integers N and K.
Next line contains N integers denoting the elements of arr[]

Constraints:
1 <= N <= 100000
1 <= arr[i] <= 100000
1 <= K <= 100000000
Output
Print a single integer the value of smallest number M
Example

Sample Input:
4 6
2 3 4 9

Sample Output:
4

Explanation:
When every element is divided by 4 - 2/4 + 3/4 + 4/4 + 9/4 = 1 + 1 + 1 + 3 = 6
When every element is divided by 3 - 2/3 + 3/3 + 4/3 + 9/3 = 1 + 1 + 2 + 3 = 7 which is greater than K.
Hence the smallest integer which makes the sum less than or equal to K = 6 is 4.'

import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N= input.nextInt();
        int target = input.nextInt();
        int Arr[] = new int[N];
        int low = 0;
        int high = 1000000000;
        for(int i=0;i<N;i++){
            Arr[i] = input.nextInt();
        }
        int value =0;
        int minSum=0;
        int j=0;
        int count =0;

        int mid = (low+high)/2;
        while(low<=high){
            for(int i=0;i<N;i++){
                value += Math.ceil((Arr[i]*1.0)/mid);
                
            }
            //System.out.println("Value is: "+value);

            if(value==target){
                System.out.println(mid);
                count++;
                break;
            }
            else if(value>target){
                //System.out.println(" first "+Arr[mid]);
                low =mid+1;
            }
            else if(value<target){
                //System.out.println(" second "+Arr[mid]);
                high = mid-1;
                if(value>minSum) minSum=value;
                
            }
            mid = (low+high)/2;
            value=0;

        }
        if(count==0){
            //System.out.println(minSum);
            int lowone = 0;
            int highone = N-1;

            int valueone =0;

            int midone = (lowone+highone)/2;
            while(lowone<=highone){
                for(int i=0;i<N;i++){
                    valueone += Math.ceil((Arr[i]*1.0)/midone);
                
                }
                //System.out.println("Value1 is: "+value1);
                if(valueone==minSum){
                    System.out.println(midone);
                    break;
                }
                else if(valueone>minSum){
                    lowone =midone+1;
                }
                else if(valueone<minSum){
                    highone = midone-1;
                }
                midone = (lowone+highone)/2;
                valueone=0;

            }
        }
    }
}