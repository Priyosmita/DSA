/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array
You are given an array of integers arr[]. Your task is to reverse the given array.

Examples:

Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is 5 6 2 3 4 1.
Input: arr = [4, 5, 2]
Output: [2, 5, 4]
Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.*/

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        // two pointer approach. Time Complexity O(log N), time taken: 0.94
        if(arr.length%2==0)
        {
            int start = 0, end = arr.length-1;
            while(start<end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        else
        {
            int start = 0, end = arr.length-1;
            while(start!=end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
