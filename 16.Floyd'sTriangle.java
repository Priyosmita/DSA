/* Taken from Apna College Java Placement Course video #5
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height:");
        int h = sc.nextInt();
        int count = 1;
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(count+++"\t");
            }
            System.out.println(" ");
        }
    }
}
