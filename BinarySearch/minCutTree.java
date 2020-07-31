Given an integer K and an array height[] of size N, where height[i] denotes the height of the ith tree in a forest. The task is to make a cut of height X from the ground such that at max K unit wood is collected. Find the minimum value of X

If you make a cut of height X from the ground then every tree with a height greater than X will be reduced to X and remaining part of wood can be collected
Input
The first line contains two integers N and K.
Next line contains N integers denoting the elements of the array height[]

Constraints
1 <= N <= 100000
1 <= arr[i] <= 100000
1 <= K <= 10000000
Output
Print a single integer the value of X.
Example

Sample Input:
4 2
1 2 1 2

Sample Output:
1

Explanation:
Make a cut at height 1, the updated array will be {1, 1, 1, 1} and
the collected wood will be {0, 1, 0, 1} i. e. 0 + 1 + 0 + 1 = 2.

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner input  = new Scanner(System.in);
        int N= input.nextInt();
        int K =input.nextInt();
        int A[]= new int[N];
        for(int i=0;i<N;i++){
            A[i]= input.nextInt();
        }
        //System.out.println(Arrays.toString(A));
        int low = 0;
        int high = 100000000;
        int mid=(low+high)/2;
        int flag =0;
        
        while(low<=high){
            int treecut = 0;

            for(int i=0;i<N;i++){
                if(A[i]>mid){
                    treecut += A[i]-mid;
                }
            }
            if(treecut==K){
                System.out.println(mid);
                flag=1;
                break;
            }
            else if(treecut>K){
                low = mid+1;
            }
            else if(treecut<K){
                high = mid-1;
            }
            mid = (low+high)/2;
            
        }
        if(flag==0){
            System.out.print(low);
        }
    }
}