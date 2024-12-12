/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element.
Examples:
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.*/

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int first=-1, second=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first || second<arr[i] && arr[i]!=first) 
            {
                if(arr[i]>first)
                {
                    second = first;
                    first = arr[i];
                }
                else if(second<arr[i])
                {
                    second = arr[i];
                }
                else
                    continue;
            }
        }
        return second;
    }
}

// Time complexity = O(N)
// Space complexity = O(1)
