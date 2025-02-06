/*
    * 
   ** 
  *** 
 **** 
***** 
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height:");
        int h = sc.nextInt();
        for(int i=h;i>0;i--)
        {
            
            for(int j=0;j<i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=i-1;k<h;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
