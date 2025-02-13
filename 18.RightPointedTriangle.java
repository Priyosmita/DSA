/* Taken from TUF 
https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
* 
** 
*** 
**** 
***** 
**** 
*** 
** 
*
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height:");
        int h = sc.nextInt();
        for(int i=0;i<(h/2)+1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=h/2;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
