package dsa.arrays;

/*9. Palindrome Number

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
-231 <= x <= 231 - 1
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Palindrome_Number_04{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println(isPalindrome(x));
        isPalindrome2("rsddsr");
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        int num = x;
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans = (ans*10) +rem;
            num /= 10;
        }
        return ans == x;
    }

    public static boolean isPalindrome2(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

        if(str.length() % 2 != 0) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) return true;
            }
        }else {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 == 0) return true;
            }
        }
        return false;
    }
}