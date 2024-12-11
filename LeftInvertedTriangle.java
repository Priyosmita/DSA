/*Example 1:
Input: 5
Output:
* * * * *
* * * * 
* * * 
* *  
* 

Example 2:
Input: 3
Output:
* * * 
* *  
*     */

class Solution {

    void printTriangle(int n) {
        // code here
        // accessing rows
        for (int i=0;i<n;i++)
        {
            for (int j=1;j<n-i+1;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
