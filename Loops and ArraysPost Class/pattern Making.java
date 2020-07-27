standard input/output: 2s/128000 kB

Given an integer n, your task is to print the pattern as shown in example:-
For n=5, the pattern is:
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 3 2 1
1 2 3 2 1
1 2 1
1
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function pattern_making() that takes the integer n as parameter.

Constraints:-
1 <= n <= 100
Output
Print the pattern as shown.
Example

Sample Input:-
5

Sample output:-
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 3 2 1
1 2 3 2 1
1 2 1
1

Sample Input:-
2

Sample Output:-
1
1 2 1
1

public static void pattern_making(int n){
    int i=1;
    for(;i<=n;i++){
        int j=1;
        for(;j<=i;j++){
            System.out.print(j + " ");
        }
        for(int k=(j-2);k>0;k--){
            System.out.print(k + " ");   
        }
        System.out.println("");
    }
    for(int l=(i-2);l>0;l--){
        int m=1;
        for(;m<=l;m++){
            System.out.print(m+" ");
        }
        for(int x =(m-2);x>0;x--){
            System.out.print(x + " "); 
        }
        System.out.println("");
        
    }

}