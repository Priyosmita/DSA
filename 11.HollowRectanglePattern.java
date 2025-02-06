/* Taken from Apna College Java Placement Course video #5
*****
*   *
*   *
*****
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int h = sc.nextInt();
        System.out.println("Enter the width: ");
        int w = sc.nextInt();
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                 if(i==0 || i==(h-1) || j==0 || j==(w-1))
                 {
                    System.out.print("*");
                 }
                 else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
