/*Example 1:
Input: 5
Output:
    *
   ***  
  *****
 *******
*********

Example 2:
Input: 3
Output:
  *
 ***  
*****
Your Task:
You don't need to input anything. Complete the function printTriangle() which takes an integer n  as the input parameter and prints the pattern.
Expected Time Complexity: O(n2).
Expected Auxiliary Space: O(1)
Constraints:
1<= n <= 1000*/

class Solution {

    void printTriangle(int n) {
        // code here
        
        for (int i=1;i<=n;i++)
        {
            // printing spaces
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            
            // printing *
            for(int k=1;k<=2*i-1;k++)
                System.out.print("*");
            
            // printing next line
            System.out.println();
        }
    }
}
