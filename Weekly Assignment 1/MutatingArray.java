Given an integer array arr and a target value K, return the integer value V such that when we change all the integers larger than V in the given array to be equal to V, the sum of the array gets as close as possible (in absolute difference) to K.

In case of a tie, return the minimum such integer.

Note: the answer is not necessarily a number from arr.
Input
The input line containing T, denoting the number of testcases. Each testcase contains 2 lines. First line contains N, size of array and target K separated by space. Second line contains elements of array.

Constraints:
1 <= T <= 50
1 <= N <= 10^4
1 <= arr[i], K <= 10^5
Output
For each testcase you need to print the minimum such integer possible in a new line.
Example

Input:
2
3 10
4 9 3
3 10
2 3 5

Output:
3
5

Explanation:
Testcase 1: When using 3 arr converts to [3, 3, 3] which sums 9 and that's the optimal answer.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T= input.nextInt();
        
        for(int l=0;l<T;l++){
            int N= input.nextInt();
            long K= input.nextLong();
            int arr[] = new int[N];
            int max =0;

            for(int j=0;j<N;j++){
                arr[j] = input.nextInt();
                if(arr[j]>max) max= arr[j];
            }
           //System.out.println("Max is:"+ max);

            int low=0;
            int high = max;
            int mid= (low+high)/2;
            long sum =0;
            int count =0;
            long lowsum=0;
            long highsum=0;
            int lowmid=0;
            int highmid=0;

            while(low<=high){
                for(int i=0;i<N;i++){
                    if(arr[i]>mid){
                        sum +=mid;
                    }
                    else if(arr[i]<=mid){
                        sum += arr[i];
                    }
                }
                //System.out.println("Sum and mid :"+ sum +" "+mid);
                if(sum==K){
                    System.out.println(mid);
                    count++;
                    break;
                }
                else if(sum>K){
                    high = mid-1;
                    highsum = sum;
                    highmid =mid;
                }
                else if(sum<K){
                    low= mid+1;
                    lowsum = sum;
                    lowmid =mid;
                }
                mid =(low+high)/2;
                sum=0;

            }
            if(count==0){
               /* System.out.println("Lowsum is: "+lowsum );
                System.out.println("Lowmid is: "+lowmid );
                System.out.println("Highsum is: "+highsum );
                System.out.println("Highmid is: "+highmid ); */
                long x=(int)Math.abs(K-lowsum);
                long y=(int)Math.abs(highsum-K);
                if(x<=y){
                    System.out.println(lowmid);
                }
                else System.out.println(highmid);

            }
            
        }
    }
}