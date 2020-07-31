Andrew is now bored with usual prime numbers and decides to find prime numbers which has exactly three factors. He sits back and keeps on thinking random numbers, and asks you to tell him if the number he has chosen had exactly 3 factors. Now he has given N random numbers, you need to tell him "Yes" if those numbers had exactly 3 factors otherwise "No".

Note: You can consider the number to be factor of its own.
Input
First-line contains N, the number of random numbers he thinks of. Second-line contains the N numbers separated by space.

Constraints:
1 <= N <= 10^5
1 <= numbers <= 10^12
Output
Print N lines containing "Yes" or "No".
Example

Sample Input 1
3
2 4 6

Sample Output 1
No
Yes
No

Explanation:
2 has 2 factors: 1, 2
4 has 3 factors: 1,2,4
6 has 4 factors: 1,2,3,6

Sample Input 2
3
3 5 7

Sample Output 2
No
No
No

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T= input.nextInt();
        for(int i=0;i<T;i++){
            long N= input.nextLong();
            double n= Math.sqrt(N);
            int flagone=0;
            int x=0;
            if(N==4){
                System.out.println("Yes");
                flagone=1;
                

            }
            int flag=0;
            if(n==(int)n && (N%2 != 0) && n>1 && flagone==00){
                for(int j=3;j<(Math.ceil(Math.abs(Math.sqrt(n)))+1);j=j+2){
                    if(n%j==0){
                        System.out.println("No");
                        flag=1;
                        break;
                    }

                }
                if(flag==0) System.out.println("Yes");
                
            }
            else if(flagone==0){
                System.out.println("No");
            }
        }
    }
}