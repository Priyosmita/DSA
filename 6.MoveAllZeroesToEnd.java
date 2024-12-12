/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.
Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.*/

// my attempt (using ArrayList wasn't permitted):
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        // separate arrays and then merge. Time Complexity O(N), Space Complexity O(N), time taken: 1.26
        int[] integers= new int[arr.length];
        int z=0,i=0;
        // seggregating
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==0)
            {
                z++; // size of zeroes
            }
            else
            {
                integers[i]= arr[j];
                i++;  // size of integers
            }
        }
        // merging
        int k=0;
        for(int j=0;j<i;j++)
        {
            arr[k]= integers[j];
            k++;
        }
        for(int j=0;j<z;j++)
        {
            arr[k]= 0;
            k++;
        }

        // Approach by GFG, time taken is a bit more (1.34) but doesn't use any extra array space
        // if element is non zero then increment count, and at the end of the iteration run a loop to fill the rest of the array with 0s
        int count= 0, i=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                arr[count]= arr[i];
                count++;
            }
        }
        while(count<i)
        {
            arr[count]=0;
            count++;
        }
    }
}
