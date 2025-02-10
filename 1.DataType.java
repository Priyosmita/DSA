/*https://www.geeksforgeeks.org/problems/data-type-1666706751/0
Geek is learning a new programming language. As data type forms the most fundamental part of a language, Geek is learning them with focus and needs your help.
Given a data type, help Geek in finding the size of it in byte.
Data Type - Character, Integer, Long, Float and Double
Example 1:
Input: Character
Output: 1
Explaination: For java it would be 2 bytes.


Example 2:
Input: Integer
Output: 4

Your Task:
Complete the function dataTypeSize() which takes a string as input and returns the size of the data type represented by the given string in byte unit.
Return -1 if the input data type is invalid.
*/

class Solution {
    static int dataTypeSize(String str) {
        // code here
        if(str.equals("Character"))
            return 1;
        else if((str.equals("Integer")) || (str.equals("Float")))
            return 4;
        else if((str.equals("Double")) || (str.equals("Long")))
            return 8;
        else
            return -1;
    }
}
