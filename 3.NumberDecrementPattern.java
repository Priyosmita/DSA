

/*Example 1:
Input: 5
Output:
1 2 3 4 5
1 2 3 4
1 2 3 
1 2  
1 
Your Task: You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.*/

// attempt 1:
class Solution {

    void printTriangle(int n) {
        // code here
        int k=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=k;j++)
            {
                System.out.print(j+" ");
            }
            --k;
            System.out.println();
        }
    }
}

// without using extra variable:
class Solution {

    void printTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n - i + 1; j++) 
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
