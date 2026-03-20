/*https://www.geeksforgeeks.org/problems/reverse-an-array/1
Already done once, program #7. Another approach

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


// Time taken: 0.6
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i = 0;
        int j = arr.length -1;
        
        while(i<j)
        {
            arr[i] = arr[i]^arr[j];
            arr[j] = arr[i]^arr[j];
            arr[i] = arr[i]^arr[j];
            
            i++;
            j--;
        }
    }
}
