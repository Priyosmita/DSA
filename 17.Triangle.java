/* Taken from Apna College Java Placement Course video #5
1
01
101
0101
10101
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height:");
        int h = sc.nextInt();
        int print = 1;
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(print);
                if(print==1)
                    print=0;
                else
                    print=1;
            }
            System.out.println(" ");
        }
    }
}
