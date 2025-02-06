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

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int h = sc.nextInt();
        for(int i=0;i<h;i++)
        {
            for(int j=h-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
