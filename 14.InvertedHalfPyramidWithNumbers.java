/* Taken from Apna College Java Placement Course video #5
12345
1234
123
12
1
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height:");
        int h = sc.nextInt();
        for(int i=h;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println(" ");
        }
    }
}
