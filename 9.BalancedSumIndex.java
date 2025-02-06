/* Given an array of numbers, find the index of the smallest array element (the pivot), for which the sums of all elements to the left and to the right are equal. The array may not be reordered.
Example
arr=[1,2,3,4,6]
The sum of the first three elements, 1+2+3=6. The value of the last element is 6.
Using zero based indexing, arr[3]-4 is the pivot between the two subarrays.
The index of the pivot is 3.

balancedSum has the following parameter(s): int arr[n]: an array of integers
Returns: int: an integer representing the index of the pivot
It is guaranteed that a solution always exists.

Sample Case 0
Sample Input 0
4   →  arr[] size n = 4
1   →  arr = [1, 2, 3, 3]
2   
3   
3   
Sample Output 0
2
Explanation 0
The sum of the first two elements, 1+2=3. The value of the last element is 3.
Using zero based indexing, arr[2]=3 is the pivot between the two subarrays.
The index of the pivot is 2.

Sample Case 1
Sample Input 1
3   →  arr[] size n = 3
1   →  arr= [1, 2, 1]
2
1
Sample Output 1
1

HackerRank IBM 
*/

// Time complexity: O(N)
// Logic: Calculate the total sum. Iterate the array and as we go calculate right sum by subtracting left sum and current element from total sum. If right sum = left sum then pivot is the ith element else update the left sum.

public static int balancedSum(List<Integer> arr) {
        
        int sum = 0, left = 0, right = 0;
  
        // Calculating total sum
        for(int i=0;i<arr.size();i++)
          {
            sum = sum+arr.get(i);
          }

        for(int i=0;i<arr.size();i++)
          {
            right = sum-left-arr.get(i);

            if(right==left)
              return i;  // Pivot found

            // Updating left sum
            left = left+arr.get(i);
          }

        return -1;
    }
